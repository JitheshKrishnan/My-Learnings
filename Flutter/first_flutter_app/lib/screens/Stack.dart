import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';

class stack extends StatelessWidget {
  const stack({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Stack',),
        centerTitle: true,
        backgroundColor: Colors.deepPurpleAccent,
      ),
      backgroundColor: Colors.yellow.shade500,
      body: Center(
        child: Stack(
          alignment: Alignment.center,
          //textDirection: TextDirection.rtl,
          children: [
            Container(
              width: 300,
              height: 200,
              color: Colors.green,
            ),
            Positioned(
              bottom: 0,
              child: Container(
                width: 200,
                height: 100,
                color: Colors.red,
              ),
            ),
            Positioned(
              right: 40,
              child: Container(
                width: 100,
                height: 50,
                color: Colors.blue,
              ),
            ),
          ],
        ),
      ),
    );
  }
}
