import 'package:flutter/material.dart';

class Home extends StatelessWidget {
  const Home({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
          child: ListView(
            itemExtent: 70.0,
            reverse: false,
            shrinkWrap: false,
            scrollDirection: Axis.vertical,
            children: [
              ListTile(
                leading: CircleAvatar(child: Icon(Icons.alarm_on_sharp), backgroundColor: Colors.green,),
                title: Text('Sales'),
                subtitle: Text('Sales of tht week'),
                trailing: Text('3500'),
                tileColor: Colors.lightGreenAccent,
                shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(10)),
                onTap: () {},
              ),
              ListTile(
                leading: CircleAvatar(child: Icon(Icons.supervised_user_circle_outlined), backgroundColor: Colors.cyan,),
                title: Text('Customers'),
                subtitle: Text('Total customers visites'),
                trailing: Text('200'),
                tileColor: Colors.cyanAccent,
                onTap: () {},
              ),
              ListTile(
                leading: CircleAvatar(child: Icon(Icons.alarm_on_sharp), backgroundColor: Colors.deepOrangeAccent,),
                title: Text('Profit'),
                subtitle: Text('Profit of the week'),
                trailing: Text('1500'),
                tileColor: Colors.orangeAccent,
                onTap: () {},
              ),
            ],
          )
      ),
    );
  }
}
