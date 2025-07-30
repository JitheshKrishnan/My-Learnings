import 'package:flutter/material.dart';

class Details extends StatelessWidget {
  Details({Key? key, required this.productName, required this.productDescription,}) : super(key: key);

  String productName;
  String productDescription;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Details'.toUpperCase()),
        leading: IconButton(icon: Icon(Icons.arrow_back), onPressed: () {
          Navigator.pop(context);
        },),
      ),
      body: Container(
        padding: EdgeInsets.all(20.0),
        child: ListView(
          children: [
            ListTile(
              leading: Icon(Icons.account_balance_wallet_outlined),
              title: Text(productName),
            ),
            ListTile(
              leading: Icon(Icons.account_balance_wallet_outlined),
              title: Text(productDescription),
            ),
          ],
        ),
      )
    );
  }
}
