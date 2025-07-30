import 'package:flutter/material.dart';

class GameHasOver extends StatelessWidget {

  bool gamehasOver;

  GameHasOver({required this.gamehasOver});

  @override
  Widget build(BuildContext context) {
    return gamehasOver
        ? Stack(
      children: [
        Container(
          alignment: const Alignment(0, -0.7),
          child: Text(
            "ohhhh no....",
            style: TextStyle(color: Colors.grey, fontSize: 40,),
          ),
        ),
        Container(
          alignment: const Alignment(0, -0.1),
          child: Image.asset('lib/photos/game_over.png'),
        )
      ],
    )
        : Container();
  }
}
