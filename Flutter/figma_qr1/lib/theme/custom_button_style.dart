import 'dart:ui';
import 'package:figma_qr1/core/app_export.dart';
import 'package:flutter/material.dart';

/// A class that offers pre-defined button styles for customizing button appearance.
class CustomButtonStyles {
  // Gradient button style
  static BoxDecoration get gradientBlueACcToLightBlueAEDecoration =>
      BoxDecoration(
        borderRadius: BorderRadius.circular(10.h),
        border: Border.all(
          color: appTheme.lightBlue500,
          width: 1.h,
        ),
        gradient: LinearGradient(
          begin: Alignment(0.5, 0),
          end: Alignment(0.5, 1),
          colors: [
            appTheme.blueA400Cc,
            appTheme.lightBlueA400E8,
          ],
        ),
      );
  // text button style
  static ButtonStyle get none => ButtonStyle(
        backgroundColor: MaterialStateProperty.all<Color>(Colors.transparent),
        elevation: MaterialStateProperty.all<double>(0),
      );
}
