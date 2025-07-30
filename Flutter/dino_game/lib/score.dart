import 'package:flutter/material.dart';

class Score extends StatelessWidget {

  final bestscore;
  final score;

  Score({this.score, this.bestscore});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: EdgeInsets.all(15),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Column(
            children: [
              Image.asset('lib/photos/score.png', width: 30,),
              Text(
                score.toString(),
                style: TextStyle(color: Colors.green, fontSize: 30,),
              )
            ],
          ),
          Column(
            children: [
              Image.asset('lib/photos/top.png', width: 40,),
              Text(
                bestscore.toString(),
                style: TextStyle(color: Colors.green, fontSize: 30,),
              )
            ],
          )
        ],
      ),
    );
  }
}
