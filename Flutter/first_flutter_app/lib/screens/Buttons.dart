import 'package:flutter/material.dart';

class Buttons extends StatelessWidget {
  const Buttons({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Directionality(
          textDirection: TextDirection.rtl,
          child: ElevatedButton(
            child: Text('Let\'s Begin'),
            // icon: Icon(Icons.ac_unit_outlined),
            // label: Text('Let\'s Begin'),
            onPressed: null,
            style: ElevatedButton.styleFrom(
              padding: EdgeInsets.all(20.0),
              fixedSize: Size(300, 80),
              textStyle: TextStyle(fontSize: 25, fontWeight: FontWeight.bold),
              primary: Colors.yellow,
              onPrimary: Colors.black,
              elevation: 15,
              shadowColor: Colors.yellow,
              side: BorderSide(color: Colors.black87, width: 2),
              //alignment: Alignment.center,
              //shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(20),),
              shape: StadiumBorder(),
            ),
          ),
        ),
      ),
    );
  }
}
