import 'package:flutter/material.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';

void main() => runApp(PracticeIcon());

class PracticeIcon extends StatelessWidget {
  const PracticeIcon({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Practice App',
      themeMode: ThemeMode.system,
      home: Scaffold(
        appBar: AppBar(
          title: Text('JK\'s DASDBOARD',),
          backgroundColor: Colors.red,
        ),
        backgroundColor: Colors.cyanAccent,
        body: Center(
          child: IconButton(
            icon: Icon(
              FontAwesomeIcons.alignCenter,
            ),
            iconSize: 100,
            color: Colors.amberAccent,
            splashColor: Colors.pink,
            highlightColor: Colors.lightGreen,
            onPressed: () {},
          ),
        ),
      ),
    );
  }
}
