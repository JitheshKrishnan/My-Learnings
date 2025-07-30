import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:stateful_widgets/Widgets/Radio.dart';
import 'details.dart';

class MyForm extends StatefulWidget {
  const MyForm({super.key});

  @override
  State<MyForm> createState() => _MyFormState();
}

class _MyFormState extends State<MyForm> {
  _MyFormState() {
    _selectedVal = _productSizesList[0];
  }

  var _productName;
  var _productDescription;
  final _productController = TextEditingController();
  final _productController1 = TextEditingController();
  ProductTypeEnum? _productTypeEnum;

  bool? _checkBox, _listTileCheckBox = false;

  final _productSizesList = ['Small', 'Medium', 'Large', 'XLarge'];
  String? _selectedVal = '';

  final _formKey = GlobalKey<FormState>();

  @override
  void dispose() {
    _productController.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: const Text('Form'),
          backgroundColor: Colors.purpleAccent,
          centerTitle: true,
        ),
        body: Container(
          color: Colors.black12,
          padding: EdgeInsets.all(20.0),
          child: ListView(
            children: [
              const Text(
                'Product',
                style: TextStyle(fontWeight: FontWeight.bold, fontSize: 20.0),
              ),
              const Text(
                'Add product details in the form below',
              ),
              const SizedBox(height: 30.0),

              //Form Tutorial
              Form(
                key: _formKey,
                child: Column(
                  children: [
                    TextFormField(
                      validator: (value){
                        if (value == null || value.isEmpty){
                          return 'Please enter some text';
                        }
                        else null;
                      },
                      controller: _productController,
                      decoration: InputDecoration(
                          labelText: 'Product Name',
                          prefixIcon: Icon(
                            Icons.verified_user_outlined,
                          ),
                          border: OutlineInputBorder()),
                    ),
                    SizedBox(
                      height: 20.0,
                    ),
                    TextFormField(
                      validator: (value){
                        if (value == null || value.isEmpty){
                          return 'Please enter some text';
                        }
                        else null;
                      },
                      controller: _productController1,
                      decoration: InputDecoration(
                          labelText: 'Product Description',
                          prefixIcon: Icon(
                            Icons.verified_user_outlined,
                          ),
                          border: OutlineInputBorder()),
                    ),

                    //CheckBox Tutorial

                    Checkbox(
                        checkColor: Colors.white,
                        activeColor: Colors.deepPurple,
                        tristate: true,
                        value: _checkBox,
                        onChanged: (val) {
                          setState(() {
                            _checkBox = val;
                          });
                        }),
                    CheckboxListTile(
                      tristate: true,
                      value: _listTileCheckBox,
                      title: Text('Top Product'),
                      controlAffinity: ListTileControlAffinity.leading,
                      tileColor: Colors.deepPurple.shade300,
                      shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.circular(10.0)),
                      onChanged: (val) {
                        setState(() {
                          _listTileCheckBox = val;
                        });
                      },
                    ),
                    SizedBox(
                      height: 20.0,
                    ),

                    //Radio Tutorial

                    Row(
                      children: [
                        MyRadioButton(
                            title: ProductTypeEnum.Deliverable.name,
                            value: ProductTypeEnum.Deliverable,
                            selectedProductType: _productTypeEnum,
                            onChanged: (val) {
                              setState(() {
                                _productTypeEnum = val;
                              });
                            }),
                        SizedBox(
                          width: 20.0,
                        ),
                        MyRadioButton(
                            title: ProductTypeEnum.Downloadable.name,
                            value: ProductTypeEnum.Downloadable,
                            selectedProductType: _productTypeEnum,
                            onChanged: (val) {
                              setState(() {
                                _productTypeEnum = val;
                              });
                            }),
                      ],
                    ),
                    SizedBox(
                      height: 20.0,
                    ),

                    //Dropdown Tutorial

                    DropdownButtonFormField(
                      value: _selectedVal,
                      items: _productSizesList
                          .map((e) => DropdownMenuItem(
                        child: Text(e),
                        value: e,
                      ))
                          .toList(),
                      icon: const Icon(
                        Icons.arrow_drop_down_circle,
                        color: Colors.deepPurple,
                      ),
                      dropdownColor: Colors.deepPurple.shade300,
                      decoration: InputDecoration(
                        labelText: 'Product Sizes',
                        prefixIcon: Icon(
                          Icons.accessibility_new_rounded,
                          color: Colors.deepPurple,
                        ),
                        border: OutlineInputBorder(),
                      ),
                      onChanged: (val) {
                        setState(() {
                          _selectedVal = val as String;
                        });
                      },
                    ),
                    SizedBox(
                      height: 20.0,
                    ),
                    myBtn(context),
                  ],
                ),
              ),


            ],
          ),
        ));
  }

  OutlinedButton myBtn(BuildContext context) {
    return OutlinedButton(
      style: OutlinedButton.styleFrom(
        minimumSize: const Size(200, 50),
      ),
      onPressed: () {},
      child: Text(
        'Submit Form'.toUpperCase(),
        style: const TextStyle(fontWeight: FontWeight.bold),
      ),
    );
  }
}
