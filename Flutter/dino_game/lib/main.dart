import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'home.dart';

void main() {
  runApp(const MyApp());
  SystemChrome.setPreferredOrientations([DeviceOrientation.landscapeLeft]);
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: falseq,
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: Home(),
    );
  }
}

