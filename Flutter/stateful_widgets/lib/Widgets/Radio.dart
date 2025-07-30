import 'package:flutter/material.dart';
import '../../form.dart';

enum ProductTypeEnum { Downloadable, Deliverable }

class MyRadioButton extends StatelessWidget {
  const MyRadioButton({super.key,
    this.keyOverride,
    required this.title,
    required this.value,
    required this.selectedProductType,
    required this.onChanged,
  });

  final Key? keyOverride;
  final String title;
  final ProductTypeEnum value;
  final ProductTypeEnum? selectedProductType;
  final Function(ProductTypeEnum?)? onChanged;

  @override
  Widget build(BuildContext context) {
    return Expanded(
      child: RadioListTile<ProductTypeEnum>(
        contentPadding: EdgeInsets.all(0.0),
        shape:
            RoundedRectangleBorder(borderRadius: BorderRadius.circular(10.0)),
        title: Text(title),
        value: value,
        groupValue: selectedProductType,
        dense: true,
        tileColor: Colors.deepPurple.shade300,
        onChanged: onChanged,
        key: key,
      ),
    );
  }
}
