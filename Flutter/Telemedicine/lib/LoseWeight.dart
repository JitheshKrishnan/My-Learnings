import 'package:flutter/material.dart';

class LoseWeight extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Lose Weight'),
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
                  title: Text('Caloric Deficit'),
                  subtitle: Text('Consume fewer calories than you burn to create a deficit for weight loss'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Balanced Diet'),
                  subtitle: Text('Include a variety of foods, focusing on complex carbs, lean proteins, and healthy fats'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Portion Control'),
                  subtitle: Text('Be mindful of portion sizes to prevent overeating'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Meal Planning'),
                  subtitle: Text('Plan your meals and snacks to avoid impulsive choices'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Hydration'),
                  subtitle: Text('Stay well-hydrated with water throughout the day'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Fiber-Rich Foods'),
                  subtitle: Text('Incorporate fruits, vegetables, and whole grains for satiety and digestion'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Protein Intake'),
                  subtitle: Text('Consume adequate protein to support fullness and muscle maintenance'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Limit Sugar and Processed Foods'),
                  subtitle: Text('Minimize sugary and highly processed items'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Cook at Home'),
                  subtitle: Text('Prepare your meals to have more control over ingredients'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Regular Exercise'),
                  subtitle: Text('Combine diet with regular physical activity for effective weight loss'),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
