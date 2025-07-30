import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';

class FltActBt extends StatelessWidget {
  const FltActBt({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.tealAccent,
      appBar: AppBar(
        leading: IconButton(
          icon: Icon(
            Icons.menu,
          ),
          onPressed: () {},
        ),
        title: Text('DASHBOARD'),
        backgroundColor: Colors.red,
      ),
      floatingActionButtonLocation: FloatingActionButtonLocation.centerDocked,
      floatingActionButton: FloatingActionButton(
        onPressed: () {},
        child: Icon(Icons.add),
        backgroundColor: Colors.black87,
        foregroundColor: Colors.yellow,
        elevation: 80,
        shape: BeveledRectangleBorder(
          borderRadius: BorderRadius.circular(20.0),
          side: BorderSide(
            color: Colors.blue,
            width: 2.0,
            style: BorderStyle.solid,
          ),
        ),
        //mini: true,
      ),
      bottomNavigationBar: BottomAppBar(
        notchMargin: 5.0,
        shape: CircularNotchedRectangle(),
        color: Colors.lightGreenAccent,
        child: Row(
          mainAxisAlignment: MainAxisAlignment.spaceAround,
          mainAxisSize: MainAxisSize.max,
          children: [
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.start,
                mainAxisSize: MainAxisSize.min,
                children: [
                  IconButton(
                    onPressed: () {},
                    icon: Icon(
                      Icons.home,
                      color: Colors.white,
                    ),
                  ),
                  Text('Home', style: TextStyle(color: Colors.white,),),
                ],
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.start,
                mainAxisSize: MainAxisSize.min,
                children: [
                  IconButton(
                    onPressed: () {},
                    icon: Icon(
                      Icons.shopping_cart,
                      color: Colors.white,
                    ),
                  ),
                  Text('Shop', style: TextStyle(color: Colors.white,),),
                ],
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.start,
                mainAxisSize: MainAxisSize.min,
                children: [
                  IconButton(
                    onPressed: () {},
                    icon: Icon(
                      Icons.favorite,
                      color: Colors.white,
                    ),
                  ),
                  Text('Fav', style: TextStyle(color: Colors.white,),),
                ],
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: Column(
                mainAxisAlignment: MainAxisAlignment.start,
                mainAxisSize: MainAxisSize.min,
                children: [
                  IconButton(
                    onPressed: () {},
                    icon: Icon(
                      Icons.settings,
                      color: Colors.white,
                    ),
                  ),
                  Text('Settings', style: TextStyle(color: Colors.white,),),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
