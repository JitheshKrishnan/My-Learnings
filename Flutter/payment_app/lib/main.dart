import 'package:flutter/material.dart';
import 'package:upi_payment_qrcode_generator/upi_payment_qrcode_generator.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'UPI Payment QRCode Generator',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: PaymentInputScreen(),
    );
  }
}

class PaymentInputScreen extends StatefulWidget {
  @override
  _PaymentInputScreenState createState() => _PaymentInputScreenState();
}

class _PaymentInputScreenState extends State<PaymentInputScreen> {
  late TextEditingController amountController;
  late String upiId;
  late String payeeName;
  late String transactionNote;

  @override
  void initState() {
    super.initState();
    amountController = TextEditingController();
    upiId = "jawaherjawa007@okaxis"; // Change this to your UPI ID
    payeeName = "jawaher R"; // Change this to the payee's name
    transactionNote = "Hello World";
  }

  @override
  void dispose() {
    amountController.dispose();
    super.dispose();
  }

  void _generateQRCode() {
    String amount = amountController.text.trim();
    if (amount.isNotEmpty) {
      double parsedAmount = double.tryParse(amount) ?? 0.0;
      if (parsedAmount > 0) {
        UPIDetails upiDetails = UPIDetails(
          upiID: upiId,
          payeeName: payeeName,
          amount: parsedAmount,
          transactionNote: transactionNote,
        );
        Navigator.push(
          context,
          MaterialPageRoute(
            builder: (context) => PaymentQRCodeScreen(upiDetails: upiDetails),
          ),
        );
      } else {
        // Show error message if invalid amount is entered
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text('Please enter a valid amount.'),
          ),
        );
      }
    } else {
      // Show error message if amount is not entered
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text('Please enter the amount to proceed.'),
        ),
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Enter Amount'),
      ),
      body: Padding(
        padding: EdgeInsets.all(20.0),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            TextField(
              controller: amountController,
              keyboardType: TextInputType.number,
              decoration: InputDecoration(
                labelText: 'Enter Amount',
              ),
            ),
            SizedBox(height: 20.0),
            ElevatedButton(
              onPressed: _generateQRCode,
              child: Text('Generate QR Code'),
            ),
          ],
        ),
      ),
    );
  }
}

class PaymentQRCodeScreen extends StatefulWidget {
  final UPIDetails upiDetails;

  PaymentQRCodeScreen({required this.upiDetails});

  @override
  _PaymentQRCodeScreenState createState() => _PaymentQRCodeScreenState();
}

class _PaymentQRCodeScreenState extends State<PaymentQRCodeScreen> {
  bool _paymentSuccess = false;
  bool _checkingStatus = false;

  void _checkPaymentStatus() async {
    setState(() {
      _checkingStatus = true;
    });

    final response = await http.get(Uri.parse('https://your-api-endpoint.com/check-payment-status?upiID=${widget.upiDetails.upiID}&amount=${widget.upiDetails.amount}'));

    if (response.statusCode == 200) {
      final status = json.decode(response.body)['status'];
      if (status == 'success') {
        setState(() {
          _paymentSuccess = true;
        });
      } else {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text('Payment not received yet.'),
          ),
        );
      }
    } else {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text('Error checking payment status.'),
        ),
      );
    }

    setState(() {
      _checkingStatus = false;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('UPI Payment QRCode Generator'),
      ),
      body: Center(
        child: _paymentSuccess
            ? Text(
          'Payment Success!',
          style: TextStyle(color: Colors.green, fontSize: 24),
        )
            : Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              "UPI Payment QRCode with Amount",
              style: TextStyle(fontWeight: FontWeight.bold),
            ),
            UPIPaymentQRCode(
              upiDetails: widget.upiDetails,
              size: 220,
              upiQRErrorCorrectLevel: UPIQRErrorCorrectLevel.low,
            ),
            Text(
              "Scan QR to Pay",
              style: TextStyle(color: Colors.grey[600], letterSpacing: 1.2),
            ),
            SizedBox(height: 20.0),
            ElevatedButton(
              onPressed: _checkingStatus ? null : _checkPaymentStatus,
              child: _checkingStatus
                  ? CircularProgressIndicator()
                  : Text('Check Payment Status'),
            ),
          ],
        ),
      ),
    );
  }
}