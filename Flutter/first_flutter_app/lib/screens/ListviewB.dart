import 'package:flutter/material.dart';

class Home extends StatelessWidget {
  Home({super.key});

  List<String> products = ["Bed", "Sofa", "Chair"];
  List<String> productDetails = ["King size bed", "King size sofa", "Wooden chair"];
  List<int> price = [3000, 2500, 1860];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        child: ListView.builder(
          itemCount: products.length,
          itemBuilder: (context, index) {
            return ListTile(
              leading: CircleAvatar(child: Text(products[index][0]),),
              title: Text(products[index],),
              subtitle: Text(productDetails[index],),
              trailing: Text(price[index].toString(),),
            );
          },
        ),
      ),
    );
  }
}
