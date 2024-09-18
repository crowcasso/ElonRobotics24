package edu.elon.robotics.auto;

/**
 * General autonomous methods.
 */

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import edu.elon.robotics.RobotHardware;

public class AutoCommon extends LinearOpMode {

    protected RobotHardware robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new RobotHardware(hardwareMap, true);
    }

    protected void turnAngle(double degrees, double maxPower) {

    }

    protected void driveDistance(double cmForward, double cmSide, double maxPower) {

    }

    protected void rampUp(int maxTicks, double maxPower, DcMotor motor) {

    }

    protected void rampDown(int maxTicks, double maxPower, DcMotor motor) {

    }

}
