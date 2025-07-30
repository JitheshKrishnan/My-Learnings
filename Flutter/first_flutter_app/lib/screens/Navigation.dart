import 'package:flutter/material.dart';

class Home extends StatelessWidget {
  Home({super.key});

  List<String> products = ["Bed", "Sofa", "Chair"];
  List<String> productDetails = [
    "King size bed",
    "King size sofa",
    "Wooden chair"
  ];
  List<int> price = [3000, 2500, 1860];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Navigation Drawer')),
      drawer: Drawer(
        elevation: 0,
        child: ListView(
          children: [
            UserAccountsDrawerHeader(
              accountEmail: Text('jitheshkrishnan.2107011@srec.ac.in'),
              accountName: Text('Jithesh Krishnan P'),
              currentAccountPicture: CircleAvatar(foregroundImage: AssetImage('images/Zohakuten.png'),),
              otherAccountsPictures: [
                CircleAvatar(foregroundImage: AssetImage('images/Sanemi.png'),),
                CircleAvatar(foregroundImage: AssetImage('images/UpperFour.png'),),
              ],
            ),
            ListTile(leading: Icon(Icons.home), title: Text('Home'), onTap: () {},),
            ListTile(leading: Icon(Icons.shop), title: Text('Shop'), onTap: () {},),
            ListTile(leading: Icon(Icons.favorite), title: Text('Favorites'), onTap: () {},),
            Padding(
              padding: const EdgeInsets.all(14.0),
              child: Text('Labels'),
            ),
            ListTile(leading: Icon(Icons.label), title: Text('Red'), onTap: () {},),
            ListTile(leading: Icon(Icons.label), title: Text('Green'), onTap: () {},),
            ListTile(leading: Icon(Icons.label), title: Text('Blue'), onTap: () {},),
          ],
        ),
      ),
      body: Container(
        child: ListView.builder(
          itemCount: products.length,
          itemBuilder: (context, index) {
            return ListTile(
              leading: CircleAvatar(
                child: Text(products[index][0]),
                backgroundColor: Colors.red,
              ),
              title: Text(
                products[index],
              ),
              subtitle: Text(
                productDetails[index],
              ),
              trailing: Text(
                price[index].toString(),
              ),
            );
          },
        ),
      ),
    );
  }
}
