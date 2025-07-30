import 'package:flutter/material.dart';
import 'package:intl/intl.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: PeriodsPredictor(),
    );
  }
}

class PeriodsPredictor extends StatefulWidget {
  @override
  _PeriodsPredictorState createState() => _PeriodsPredictorState();
}

class _PeriodsPredictorState extends State<PeriodsPredictor> {
  final TextEditingController _previousDateController = TextEditingController();
  DateTime _nextPeriodDate = DateTime.now(); // Initialize with the current date
  DateFormat _dateFormat = DateFormat('MMMM dd, yyyy');

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Periods Predictor'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            TextField(
              controller: _previousDateController,
              decoration: InputDecoration(labelText: 'Enter Previous Date (dd-mm-yyyy)'),
              keyboardType: TextInputType.datetime,
            ),
            SizedBox(height: 16.0),
            ElevatedButton(
              onPressed: () {
                _predictNextPeriod();
              },
              child: Text('Predict Next Period'),
            ),
            SizedBox(height: 16.0),
            if (_nextPeriodDate != null)
              Text(
                'Next 3 Periods:\n' +
                    _dateFormat.format(_nextPeriodDate) +
                    '\n' +
                    _dateFormat.format(_nextPeriodDate.add(Duration(days: 28))) +
                    '\n' +
                    _dateFormat.format(_nextPeriodDate.add(Duration(days: 56))),
                textAlign: TextAlign.center,
              ),
          ],
        ),
      ),
    );
  }

  void _predictNextPeriod() {
    final inputDateFormat = DateFormat('dd-MM-yyyy');
    final previousDate = inputDateFormat.parse(_previousDateController.text, true);
    if (previousDate != null) {
      final cycleLength = 28; // Change as needed
      final nextPeriodDate = previousDate.add(Duration(days: cycleLength));
      setState(() {
        _nextPeriodDate = nextPeriodDate;
      });
    } else {
      // Handle invalid input
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text('Invalid date format. Please use dd-mm-yyyy.'),
        ),
      );
    }
  }
}
