import 'dart:math';
import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

class Dashboard extends StatelessWidget {
  const Dashboard({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        width: 350.0,
        height: 250.0,
        padding: EdgeInsets.all(20.0),
        margin: EdgeInsets.all(50.0),
        alignment: Alignment.center,
        decoration: BoxDecoration(
          color: Colors.blue,
          // borderRadius: BorderRadius.circular(10.0),
          border: Border.all(
            color: Colors.red,
            width: 6.0,
          ),
          shape: BoxShape.circle,
          image: DecorationImage(
            image: AssetImage('images/Zohakuten.png'),
          ),
          boxShadow: [
            BoxShadow(
              color: Colors.grey.shade900,
              blurRadius: 7,
              spreadRadius: 5,
              offset: Offset(4,4),
            ),
          ],
        ),

         child: Text(
           'Less Boring',
           style: TextStyle(
             fontSize: 40,
             fontWeight: FontWeight.bold,
           ),
         ),
      ),
    );
  }
}

int getNumber() {
  return Random().nextInt(100);
}
