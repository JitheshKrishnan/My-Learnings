import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';

import '../widgets/listview.dart';

class Home extends StatelessWidget {
  const Home({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          'Custom Widget',
        ),
        centerTitle: true,
      ),
      body: ListView(
        children: [
          ListTileWidget(
            title: 'Mouse',
            subTitle: 'A4Texh Mouse',
          ),
          ListTileWidget(
            title: 'Laptop',
            subTitle: 'beastAudio Laptop Core i7',
            leadingIcon: Icons.laptop,
            listTileColor: Colors.black12,
            iconColor: Colors.blue,
          ),
          ListTileWidget(
            title: 'Mouse',
            subTitle: 'A4Texh Mouse',
          ),
        ],
      ),
    );
  }
}
