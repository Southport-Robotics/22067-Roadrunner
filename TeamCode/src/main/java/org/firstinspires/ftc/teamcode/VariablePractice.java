package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import java.util.StringTokenizer;
@Disabled
@TeleOp
public class VariablePractice extends OpMode {

    @Override
    public void init() {
        //this create the base of the variables
        int teamNumber = 22067;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String teamName = "Red Shift";
        int motorAngle = 120;
        String Test = "chloe";

        //this displays things on the screen of the driver hub
        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Name", teamName);
        telemetry.addData("Motor Angle", motorAngle);
        telemetry.addData("Testging", Test)
    }

    @Override
    public void loop() {

    }
}