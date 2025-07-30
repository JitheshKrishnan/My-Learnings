import 'package:dino_game/score.dart';
import 'package:flutter/material.dart';
import 'barricade.dart';
import 'click_to_start.dart';
import 'dino.dart';

class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {

  bool gameHasStarted = false;
  int score = 0;
  int bestscore = 0;

  double dinoX = - 0.5;
  double dinoY = 1;
  double dinoHeight = 0.2;
  double dinoWidth = 0.4;

  double barricadeX = 0.5;
  double barricadeY = 1;
  double barricadeWidth = 0.2;
  double barricadeHeight = 0.4;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
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
                ],
              ),
            ),
          ),
          Expanded(
            child: Container(
              color: Colors.amberAccent,
              child: Center(
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
    );
  }
}
