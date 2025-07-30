import 'package:figma_qr1/core/app_export.dart';
import 'package:figma_qr1/widgets/custom_outlined_button.dart';
import 'package:flutter/material.dart';

class AndroidSmallOneScreen extends StatelessWidget {
  const AndroidSmallOneScreen({Key? key})
      : super(
          key: key,
        );

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
        body: Container(
          width: double.maxFinite,
          padding: EdgeInsets.symmetric(vertical: 86.v),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              SizedBox(height: 5.v),
              SizedBox(
                width: 145.h,
                child: Text(
                  "Scan the QR code in your prescription",
                  maxLines: 2,
                  overflow: TextOverflow.ellipsis,
                  textAlign: TextAlign.center,
                  style: theme.textTheme.bodySmall,
                ),
              ),
              SizedBox(height: 59.v),
              CustomImageView(
                imagePath: ImageConstant.imgQr1,
                height: 216.adaptSize,
                width: 216.adaptSize,
                radius: BorderRadius.circular(
                  50.h,
                ),
              ),
              Spacer(),
              CustomOutlinedButton(
                width: 182.h,
                text: "Scan QR Code",
                buttonStyle: CustomButtonStyles.none,
                onPressed: () {},
                decoration:
                    CustomButtonStyles.gradientBlueACcToLightBlueAEDecoration,
              ),
            ],
          ),
        ),
      ),
    );
  }
}
