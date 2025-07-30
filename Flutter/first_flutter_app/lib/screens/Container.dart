import 'package:flutter/material.dart';

class PracticeContainer extends StatelessWidget {
  const PracticeContainer({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.pink,
      body: Container(
        height: 250,
        width: 350,
        padding: EdgeInsets.all(10),
        margin: EdgeInsets.all(40),
        alignment: Alignment.center,
        decoration: BoxDecoration(
          color: Colors.lightGreenAccent,
          shape: BoxShape.circle,
          border: Border.all(
            color: Colors.deepPurpleAccent,
            width: 8.0,
          ),
          image: DecorationImage(
            image: AssetImage(
              'images/Zohakuten.png',
            ),
          ),
          boxShadow: [
            BoxShadow(
              color: Colors.grey.shade900,
              blurRadius: 10,
              spreadRadius: 10,
              offset: Offset(4,4),
            ),
          ],
        ),
        child: Text(
          ' ',
          style: TextStyle(
            fontSize: 30.0,
            fontWeight: FontWeight.bold,
            color: Colors.brown,
          ),
        ),
      ),
    );
  }
}
