import 'dart:async';
import 'package:untitled/score.dart';
import 'package:flutter/material.dart';
import 'barricade.dart';
import 'click_to_start.dart';
import 'dino.dart';
import 'game_has_over.dart';
import 'package:http/http.dart' as http;

class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {

  int score = 0;
  int bestscore = 0;
  bool gameHasStarted = false;
  bool gamehasOver = false;
  bool centralJump = false;
  bool dinoHasPassedBarricade = false;

  double gravity = 9.8;
  double height = 0;
  double time = 0;
  double velocity = 5;

  double dinoX = - 0.5;
  double dinoY = 1;
  double dinoHeight = 0.4;
  double dinoWidth = 0.2;

  double barricadeX = 0.5;
  double barricadeY = 1;
  double barricadeWidth = 0.2;
  double barricadeHeight = 0.4;

  final String esp32Address = 'http://192.168.238.130:8080';

  @override
  void initState() {
    super.initState();
    // Start listening for commands from ESP32
    listenForCommands();
  }

  void listenForCommands() async {
    final response = await http.get(Uri.parse('$esp32Address/command'));
    if (response.statusCode == 200) {
      // Interpret the command received
      final command = response.body;
      if (command == 'true') {
        if (!gameHasStarted && !gamehasOver) {
          startGame();
        } else if (gamehasOver) {
          playGameAgain();
        } else {
          jumpDino();
        }
      }
    } else {
      // Handle errors
    }
  }

  void startGame()
  {
    setState(() {
      gameHasStarted = true;
    });

    Timer.periodic(const Duration(milliseconds: 10), (timer)
    async {
      if(detectForCollision())
        {
          gamehasOver = true;
          timer.cancel();
          setState(() {
            if(score > bestscore)
              {
                bestscore = score;
              }
          });
        }

      loopForBarricade();

      updateForScore();

      setState(() {
        barricadeX -= 0.01;
      });
    });
  }

  void updateForScore()
  {
    if(barricadeX < dinoX && dinoHasPassedBarricade == false)
      {
        setState(() {
          dinoHasPassedBarricade = true;
          score++;
        });
      }
  }

  void loopForBarricade()
  {
    setState(() {
      if(barricadeX <= -1.2)   //change
        {
          barricadeX = 1.2;
          dinoHasPassedBarricade = false;
        }
    });
  }

  bool detectForCollision()
  {
    if(barricadeX <= dinoX + dinoWidth && barricadeX + barricadeWidth >= dinoX && dinoY >= barricadeY - barricadeHeight)
      {
        return true;
      }
    return false;
  }

  void jumpDino()
  {
    centralJump = true;
    Timer.periodic(const Duration(milliseconds: 10), (timer)
    {
      height = -gravity / 2 * time * time + velocity * time;

      setState(() {
        if(1 - height > 1)
          {
            resetJumpDino();
            dinoY = 1;
            timer.cancel();
          }
        else
          {
            dinoY = 1 - height;
          }
      });

      if(gamehasOver)
        {
          timer.cancel();
        }

      time += 0.01;
    });
  }

  void resetJumpDino()
  {
    centralJump = false;
    time = 0;
  }

  void playGameAgain()
  {
    setState(() {
      gamehasOver = false;
      gameHasStarted = false;
      barricadeX = 1.2;
      score = 0;
      dinoY = 1;
      centralJump = false;
    });
  }


  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: gamehasOver
             ? (playGameAgain)
             : (gameHasStarted ? (centralJump ? null : jumpDino) : startGame),
      child: Scaffold(
        backgroundColor: Colors.blue,
        body: Column(
          children: [
            Expanded(
              flex: 2,
              child: Center(
                child: Stack(
                  children: [
                    ClickToStart(
                      gameHasStarted: gameHasStarted,
                    ),
                    Score(
                      score: score,
                      bestscore: bestscore,
                    ),
                    Dino(
                      dinoX: dinoX,
                      dinoY:dinoY - dinoHeight,
                      dinoWidth: dinoWidth,
                      dinoHeight: dinoHeight,
                    ),
                    Barricade(
                      barricadeX: barricadeX,
                      barricadeY: barricadeY - barricadeHeight,
                      barricadeWidth: barricadeWidth,
                      barricadeHeight: barricadeHeight,
                    ),
                    GameHasOver(
                      gamehasOver: gamehasOver,
                    ),
                  ],
                ),
              ),
            ),
            Expanded(
              child: Container(
                color: Colors.amberAccent,
                child: const Center(
                  child: Text(
                    'D I N O  G A M E',
                    style: TextStyle(
                        color: Colors.white,
                        fontSize: 22,
                        fontWeight: FontWeight.bold
                    ),
                  ),
                ),
              ),
            )
          ],
        )
      ),
    );
  }
}
