package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {

    }


    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;

        // turbo mode if a is pressed
        if (!gamepad1.a){
            motorSpeed *= 0.5;
        }


        telemetry.addData("left stick value", motorSpeed);
    }


}
      /* This was a sample of how to show true of false
        boolean aButton = gamepad1.a; // press true, depress false
        if (aButton) {
            telemetry.addData("A Button", "Pressed!");
        }
        else {
            telemetry.addData("A Button", "Not Pressed");
        }
        telemetry.addData("A Button State", aButton);
    }

  /////////////////////////////////////////////////////////////
 This is using else and else if
         double leftY = gamepad1.left_stick_y;

        if (leftY < 0) {
            telemetry.addData("left stick", "is Negative");
        }
        else if (leftY > 0.5) {
            telemetry.addData("left stick", "greater than 50%");
        }
        else if (leftY > 0) {
            telemetry.addData("left stick", "is positive");
        }
        else {
            telemetry.addData("left stick", "is Zero");
        }
        telemetry.addData("left stick value", leftY);

           */