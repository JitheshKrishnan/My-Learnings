import 'package:flutter/material.dart';

class ClickToStart extends StatelessWidget {
  final bool gameHasStarted;
  ClickToStart({required this.gameHasStarted});

  @override
  Widget build(BuildContext context) {
    return gameHasStarted
        ? Container()
        : Stack(
      children: [
        Container(
          alignment: Alignment(0, 0),
          child: Image.asset('lib/photos/start_game.png', height: 100, width: 200,),
        ),
        Container(
          alignment: Alignment(0, -0.7),
          child: Text('Dino Game',
          style: TextStyle(
            color: Colors.green,
            fontSize: 20,
            fontWeight: FontWeight.bold,
          ),),
        )
      ],
    );
  }
}
