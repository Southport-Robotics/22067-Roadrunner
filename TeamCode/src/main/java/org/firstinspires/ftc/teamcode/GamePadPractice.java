package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }
    @Override
    public void loop() {
    // Runs 50x a second
    //Dobule Section
        double speedFoward = -gamepad1.left_stick_y /2.0;
        double DiffXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double RearTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

    //left Stick
        telemetry.addData("LS X", gamepad1.left_stick_x);
        telemetry.addData("LS Y", speedFoward);
    //Right Stick
        telemetry.addData("RS X", gamepad1.right_stick_x);
        telemetry.addData("RS Y", gamepad1.right_stick_y);
    //Stick Telemetry
        telemetry.addData("Diffrence Stick X", DiffXJoysticks);
        telemetry.addData("Sum of Triggers", RearTriggers);
    //Buttons
        telemetry.addData("A Button", gamepad1.a);
        telemetry.addData("B Button", gamepad1.b);

    }
}


