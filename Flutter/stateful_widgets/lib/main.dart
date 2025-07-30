import 'package:flutter/material.dart';
import 'package:stateful_widgets/form.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: '3.2 Flutter Push Pop',
      theme: ThemeData.dark(),
      home: MyForm()
    );
  }
}

class JKStatelessClass extends StatelessWidget {
  const JKStatelessClass({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Stateful Widgets Flutter - 3.1'),
          centerTitle: true,
        ),
        body: JKStatefulClass(),
      ),
    );
  }
}
class JKStatefulClass extends StatefulWidget {
  const JKStatefulClass({super.key});

  @override
  State<JKStatefulClass> createState() => _JKStatefulClassState();
}
class _JKStatefulClassState extends State<JKStatefulClass> {

  bool liked = false;

  @override
  Widget build(BuildContext context) {
    return ListView(
      children: [
        Padding(
          padding: const EdgeInsets.all(10.0),
          child: ListTile(
            title: Text('Nike Shoes'),
            trailing: IconButton(
              icon: liked? (Icon(Icons.favorite, color: Colors.pink,)) : (Icon(Icons.favorite_border)),
              onPressed: () {
                setState(() => liked = !liked);
              },
            ),
            tileColor: liked? (Colors.black12) : (Colors.white),
            shape: ContinuousRectangleBorder(borderRadius: BorderRadius.circular(20.0)),
          ),
        ),
      ],
    );
  }
}
