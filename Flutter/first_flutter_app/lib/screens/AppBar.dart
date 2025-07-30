import 'package:flutter/material.dart';

class Appbar extends StatelessWidget {
  const Appbar({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        extendBodyBehindAppBar: true,
        appBar: AppBar(
          leading: IconButton(
            icon: Icon(Icons.menu, color: Colors.black,),
            onPressed: () {},
          ),
          title: Text('Home', style: TextStyle(color: Colors.black,),),
          actions: [
            IconButton(
              icon: Icon(Icons.shopping_cart, color: Colors.black,),
              onPressed: () {},
            ),
            IconButton(
              icon: Icon(Icons.search, color: Colors.black,),
              onPressed: () {},
            ),
            IconButton(
              icon: Icon(Icons.more, color: Colors.black,),
              onPressed: () {},
            ),
          ],
          elevation: 20.0,
          //titleSpacing: 20.0,,
          //centerTitle: true,
          backgroundColor: Colors.deepPurpleAccent.withOpacity(0.9),
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.vertical(
              bottom: Radius.circular(20),
            ),
          ),
          flexibleSpace: Image(
            image: NetworkImage(
              'https://w7.pngwing.com/pngs/551/298/png-transparent-full-moon-and-starry-night-atmosphere-sky-universe-outer-space-blue-blue-sky-background-texture-blue-other.png',
            ),
            fit: BoxFit.cover,
          ),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text(
                'AppBar Tutorial',
                style: TextStyle(
                  fontSize: 22,
                ),
              ),
              Text(
                'New File',
                style: TextStyle(
                  fontWeight: FontWeight.bold,
                  color: Colors.purple,
                ),
              ),
            ],
          ),
        ));
  }
}
