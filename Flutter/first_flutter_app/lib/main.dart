//import 'package:first_flutter_app/screens/Home.dart';
import 'package:font_awesome_flutter/font_awesome_flutter.dart';
import 'package:flutter/material.dart';
import 'dart:math';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'My Flutter App',
        themeMode: ThemeMode.system,
        debugShowCheckedModeBanner: false,
        home: Buttons(),);
  }
}

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
class Appbar extends StatelessWidget {
  const Appbar({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        extendBodyBehindAppBar: true,
        appBar: AppBar(
          leading: IconButton(
            icon: Icon(
              Icons.menu,
              color: Colors.black,
            ),
            onPressed: () {},
          ),
          title: Text(
            'Home',
            style: TextStyle(
              color: Colors.black,
            ),
          ),
          actions: [
            IconButton(
              icon: Icon(
                Icons.shopping_cart,
                color: Colors.black,
              ),
              onPressed: () {},
            ),
            IconButton(
              icon: Icon(
                Icons.search,
                color: Colors.black,
              ),
              onPressed: () {},
            ),
            IconButton(
              icon: Icon(
                Icons.more,
                color: Colors.black,
              ),
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
class Buttons extends StatelessWidget {
  const Buttons({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Directionality(
          textDirection: TextDirection.rtl,
          child: ElevatedButton(
            child: Text(
              'Let\'s Begin',
              style: TextStyle(
                color: Colors.black,
              ),
            ),
            // icon: Icon(Icons.ac_unit_outlined),
            // label: Text('Let\'s Begin'),
            onPressed: () {},
            style: ElevatedButton.styleFrom(
              padding: EdgeInsets.all(20.0),
              fixedSize: Size(200, 80),
              textStyle: TextStyle(
                fontSize: 25,
                fontWeight: FontWeight.bold,
                color: Colors.black,
              ),
              primary: Colors.yellow,
              onPrimary: Colors.black,
              elevation: 15,
              shadowColor: Colors.yellow,
              side: BorderSide(color: Colors.black87, width: 5),
              //alignment: Alignment.center,
              //shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(20),),
              shape: StadiumBorder(),
            ),
          ),
        ),
      ),
    );
  }
}
class PracticeContainer extends StatelessWidget {
  const PracticeContainer({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.pinkAccent,
      body: Container(
        height: 250,
        width: 350,
        padding: EdgeInsets.all(10),
        margin: EdgeInsets.all(40),
        alignment: Alignment.center,
        decoration: BoxDecoration(
          color: Colors.lightGreenAccent,
          shape: BoxShape.circle,
          border: Border.all(
            color: Colors.deepPurpleAccent,
            width: 8.0,
          ),
          image: DecorationImage(
            image: AssetImage(
              'images/Zohakuten.png',
            ),
          ),
          boxShadow: [
            BoxShadow(
              color: Colors.grey.shade900,
              blurRadius: 10,
              spreadRadius: 10,
              offset: Offset(4,4),
            ),
          ],
        ),
        child: Text(
          'Zohakuten',
          style: TextStyle(
            fontSize: 30.0,
            fontWeight: FontWeight.bold,
            color: Colors.brown,
          ),
        ),
      ),
    );
  }
}
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
class PracticeIcon extends StatelessWidget {
  const PracticeIcon({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Practice App',
      themeMode: ThemeMode.system,
      home: Scaffold(
        appBar: AppBar(
          title: Text('JK\'s DASDBOARD',),
          backgroundColor: Colors.red,
        ),
        backgroundColor: Colors.cyanAccent,
        body: Center(
          child: IconButton(
            icon: Icon(
              FontAwesomeIcons.alignCenter,
            ),
            iconSize: 100,
            color: Colors.amberAccent,
            splashColor: Colors.pink,
            highlightColor: Colors.lightGreen,
            onPressed: () {},
          ),
        ),
      ),
    );
  }
}
class Listview extends StatelessWidget {
  const Listview({super.key});

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
              Padding(
                padding: const EdgeInsets.all(4.0),
                child: ListTile(
                  leading: CircleAvatar(
                    child: Icon(Icons.alarm_on_sharp),
                    backgroundColor: Colors.green,
                  ),
                  title: Text('Sales'),
                  subtitle: Text('Sales of tht week'),
                  trailing: Text('3500'),
                  tileColor: Colors.lightGreenAccent,
                  shape:
                  RoundedRectangleBorder(borderRadius: BorderRadius.circular(10)),
                  onTap: () {},
                ),
              ),
              Padding(
                padding: const EdgeInsets.all(4.0),
                child: ListTile(
                  leading: CircleAvatar(
                    child: Icon(Icons.supervised_user_circle_outlined),
                    backgroundColor: Colors.cyan,
                  ),
                  title: Text('Customers'),
                  subtitle: Text('Total customers visites'),
                  trailing: Text('200'),
                  tileColor: Colors.cyanAccent,
                  shape:
                  RoundedRectangleBorder(borderRadius: BorderRadius.circular(10)),
                  onTap: () {},
                ),
              ),
              Padding(
                padding: const EdgeInsets.all(4.0),
                child: ListTile(
                  leading: CircleAvatar(
                    child: Icon(Icons.alarm_on_sharp),
                    backgroundColor: Colors.deepOrangeAccent,
                  ),
                  title: Text('Profit'),
                  subtitle: Text('Profit of the week'),
                  trailing: Text('1500'),
                  tileColor: Colors.orangeAccent,
                  shape:
                  RoundedRectangleBorder(borderRadius: BorderRadius.circular(10)),
                  onTap: () {},
                ),
              ),
            ],
          )),
    );
  }
}
class Listviewbuilder extends StatelessWidget {
  Listviewbuilder({super.key});

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
class Navigation extends StatelessWidget {
  Navigation({super.key});

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
class stack extends StatelessWidget {
  const stack({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Stack',),
        centerTitle: true,
        backgroundColor: Colors.deepPurpleAccent,
      ),
      backgroundColor: Colors.yellow.shade500,
      body: Center(
        child: Stack(
          alignment: Alignment.center,
          //textDirection: TextDirection.rtl,
          children: [
            Container(
              width: 300,
              height: 200,
              color: Colors.green,
            ),
            Positioned(
              bottom: 0,
              child: Container(
                width: 200,
                height: 100,
                color: Colors.red,
              ),
            ),
            Positioned(
              right: 40,
              child: Container(
                width: 100,
                height: 50,
                color: Colors.blue,
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class Dashboard extends StatelessWidget {
  const Dashboard({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        width: 350.0,
        height: 250.0,
        padding: EdgeInsets.all(20.0),
        margin: EdgeInsets.all(50.0),
        alignment: Alignment.center,
        decoration: BoxDecoration(
          color: Colors.blue,
          // borderRadius: BorderRadius.circular(10.0),
          border: Border.all(
            color: Colors.red,
            width: 6.0,
          ),
          shape: BoxShape.circle,
          image: DecorationImage(
            image: AssetImage('images/Zohakuten.png'),
          ),
          boxShadow: [
            BoxShadow(
              color: Colors.grey.shade900,
              blurRadius: 7,
              spreadRadius: 5,
              offset: Offset(4,4),
            ),
          ],
        ),

        child: Text(
          'Less Boring',
          style: TextStyle(
            fontSize: 40,
            fontWeight: FontWeight.bold,
          ),
        ),
      ),
    );
  }
}

int getNumber() {
  return Random().nextInt(100);
}