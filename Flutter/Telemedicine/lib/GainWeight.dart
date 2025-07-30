import 'package:flutter/material.dart';

class GainWeight extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Gain Weight'),
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
                  title: Text('Caloric Surplus'),
                  subtitle: Text('Consume more calories than you expend to create a surplus for weight gain'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Balanced Diet'),
                  subtitle: Text('Focus on nutrient-dense foods, including whole grains, lean proteins, healthy fats, and a variety of fruits and vegetables'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Larger Portions'),
                  subtitle: Text(' Increase portion sizes to provide more calories per meal'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Frequent Meals'),
                  subtitle: Text('Eat more frequent, balanced meals and snacks throughout the day'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Protein-Rich Foods'),
                  subtitle: Text('Include protein sources like lean meats, dairy, eggs, and plant-based options to support muscle growth'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Healthy Fats'),
                  subtitle: Text('Incorporate sources of healthy fats, such as avocados, nuts, seeds, and olive oil, to boost calorie intake'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Strength Training'),
                  subtitle: Text('Include weightlifting and resistance exercises in your fitness routine to build muscle mass'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Nutrient-Rich Snacks'),
                  subtitle: Text('Choose high-calorie snacks like nuts, dried fruits, and yogurt'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Avoid Empty Calories'),
                  subtitle: Text('While increasing calories is essential, avoid excessive consumption of sugary or highly processed foods'),
                ),
              ),
              Card(
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(15.0), // Adjust the radius as needed
                ),
                child: ListTile(
                  title: Text('Consult a Professional'),
                  subtitle: Text('If you\'re struggling to gain weight or have specific dietary needs, consider seeking guidance from a registered dietitian or nutritionist'),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}