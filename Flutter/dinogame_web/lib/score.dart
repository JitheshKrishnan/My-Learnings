import 'package:flutter/material.dart';

class Score extends StatelessWidget {

  final bestscore;
  final score;

  Score({this.score, this.bestscore});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(15),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Column(
            children: [
              Image.asset('lib/photos/score.png', width: 30,),
              Text(
                score.toString(),
                style: const TextStyle(color: Colors.green, fontSize: 30,),
              )
            ],
          ),
          Column(
            children: [
              Image.asset('lib/photos/top.png', width: 40,),
              Text(
                bestscore.toString(),
                style: const TextStyle(color: Colors.green, fontSize: 30,),
              )
            ],
          )
        ],
      ),
    );
  }
}
