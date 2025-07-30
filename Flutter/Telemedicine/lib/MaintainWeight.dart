import 'package:flutter/material.dart';

class MaintainWeight extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Maintain Weight'),
        centerTitle: true,
        backgroundColor: Colors.green,
      ),
      body: Center(
        child: Container(
          child: ListView(
            children: [
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Caloric Balance'),
                  subtitle: Text('Consume roughly the same number of calories you burn to maintain your weight'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Balanced Diet'),
                  subtitle: Text('Continue to eat a well-rounded diet with a variety of nutrients'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Portion Control'),
                  subtitle: Text('Be mindful of portion sizes to prevent unintentional weight gain'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Regular Meals'),
                  subtitle: Text('Stick to regular meal times to maintain consistent energy levels'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Hydration'),
                  subtitle: Text('Continue to stay well-hydrated with water throughout the day'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Monitor Intake'),
                  subtitle: Text('Keep an eye on your food and beverage choices to avoid overindulging'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Regular Exercise'),
                  subtitle: Text(' Maintain a regular exercise routine for overall health and weight maintenance'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Mindful Eating'),
                  subtitle: Text('Pay attention to what you eat and savor your meals to prevent overconsumption'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Stay Active'),
                  subtitle: Text('Incorporate physical activity into your daily life, such as walking, taking the stairs, or engaging in hobbies that involve movement'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Regular Check-Ins'),
                  subtitle: Text('Periodically assess your weight and dietary habits to ensure you\'re staying on track'),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}