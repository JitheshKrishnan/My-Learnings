import 'package:flutter/material.dart';

class Rowcol extends StatelessWidget {
  const Rowcol({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Rows and Columns'.toUpperCase(),),
        centerTitle: true,
      ),
      body: Container(
        child: Column(
          children: [
            Row(
              children: [
                Expanded(child: Image(image: AssetImage('images/Zohakuten.png'), width: 120,)),
                Expanded(flex: 2, child: Image(image: AssetImage('images/Zohakuten.png'), width: 120,)),
                Expanded(flex: 3, child: Image(image: AssetImage('images/Zohakuten.png'), width: 120,)),
              ],
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Icon(Icons.star, size: 35.0),
                Icon(Icons.star, size: 35.0),
                Icon(Icons.star, size: 35.0),
                Icon(Icons.star, size: 35.0),
                Icon(Icons.star_border, size: 35.0),
              ],
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              crossAxisAlignment: CrossAxisAlignment.end,
              children: [
                Column(
                  children: [
                    Icon(Icons.phone, size: 35.0,),
                    Text('Phone',),
                  ],
                ),
                Column(
                  children: [
                    Icon(Icons.alt_route, size: 35.0,),
                    Text('Route',),
                  ],
                ),
                Column(
                  children: [
                    Icon(Icons.share, size: 35.0,),
                    Text('Share',),
                  ],
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
