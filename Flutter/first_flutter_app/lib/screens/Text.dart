import 'package:flutter/material.dart';

class text extends StatelessWidget {
  const text({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        leading: IconButton(
          icon: Icon(
            Icons.menu,
            color: Colors.white,
          ),
          onPressed: () {},
        ),
        title: Text(
          'Home'.toUpperCase(),
        ),
        actions: [
          IconButton(
            icon: Icon(
              Icons.more_horiz,
              color: Colors.white,
            ),
            onPressed: () {},
          )
        ],
        backgroundColor: Colors.orange,
      ),
      body: Container(
            child: ListView(
              children: [
                ListTile(
                  leading: CircleAvatar(child: Icon(Icons.dataset), backgroundColor: Colors.cyan),
                  title: Text('Blood Donors'),
                  subtitle: Text('List of available donors'),
                  trailing: Text('748'),
                  tileColor: Colors.cyanAccent,
                ),
                ListTile(
                  leading: CircleAvatar(child: Icon(Icons.computer), backgroundColor: Colors.lightGreen),
                  title: Text('Find donors'),
                  subtitle: Text('Identify the appropriate donor'),
                  trailing: Icon(Icons.question_mark),
                  tileColor: Colors.lightGreenAccent,
                ),
                ListTile(
                  leading: CircleAvatar(child: Icon(Icons.history), backgroundColor: Colors.purple),
                  title: Text('History'),
                  subtitle: Text('Your past searches'),
                  trailing: Icon(Icons.history_toggle_off),
                  tileColor: Colors.purpleAccent,
                ),
              ],
            ),
          ),
    );
  }
}
