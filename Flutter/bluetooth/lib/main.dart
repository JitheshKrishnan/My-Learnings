import 'package:flutter/material.dart';
import 'package:flutter_blue_plus/flutter_blue_plus.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: MyBluetoothApp(),
    );
  }
}

class MyBluetoothApp extends StatefulWidget {
  @override
  _MyBluetoothAppState createState() => _MyBluetoothAppState();
}

class _MyBluetoothAppState extends State<MyBluetoothApp> {
  FlutterBluePlus flutterBlue = FlutterBluePlus.instance;
  BluetoothDevice? targetDevice;

  @override
  void initState() {
    super.initState();
    initBluetooth();
  }

  void initBluetooth() async {
    await flutterBlue.startScan(timeout: Duration(seconds: 4));

    flutterBlue.scanResults.listen((List<ScanResult> results) {
      // Check for your ESP32 device and connect
      for (ScanResult result in results) {
        if (result.device.name == "YourESP32DeviceName") {
          targetDevice = result.device;
          targetDevice!.connect();
          break;
        }
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Bluetooth Communication'),
      ),
      body: Center(
        child: Text('Your Bluetooth Communication UI Here'),
      ),
    );
  }
}
