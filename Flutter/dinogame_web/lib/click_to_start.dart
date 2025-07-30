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
          alignment: const Alignment(0, 0),
          child: Image.asset('lib/photos/start_game.png',),
        ),
        Container(
          alignment: const Alignment(0, -0.7),
          child: const Text('Dino Game',
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
