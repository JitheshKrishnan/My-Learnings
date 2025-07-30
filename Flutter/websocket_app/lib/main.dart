import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'ESP32 Communication',
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('ESP32 Communication'),
      ),
      body: Center(
        child: ElevatedButton(
          onPressed: () {
            sendDataToESP32();
          },
          child: Text('Send Data to ESP32'),
        ),
      ),
    );
  }

  Future<void> sendDataToESP32() async {
    final int xValue = 10; // Change x to an integer value
    final String yValue = 'jk'; // Change y to a string value

    final response = await http.post(
      Uri.parse('http://192.168.43.230:8080/medicine-details'), 
      body: {
        'x': xValue.toString(),
        'y': yValue,
      },
    );

    if (response.statusCode == 200) {
      print('Data sent successfully');
    } else {
      print('Failed to send data. Status code: ${response.statusCode}');
    }
  }
}
