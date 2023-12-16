package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp(name = "TeleOpM", group = "Robot")
public class TeleOpM extends LinearOpMode {

    HMAP robot = new HMAP();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.initialize(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {
            double y = gamepad1.left_stick_y;
            double x = gamepad1.left_stick_x;
            double rx = gamepad1.right_stick_x;

            robot.LF.setPower((-y + x + rx));
            robot.LB.setPower((-y - x + rx));
            robot.RF.setPower((-y - x - rx));
            robot.RB.setPower((-y + x - rx));

            if (gamepad1.right_trigger>0) {
                robot.arm1.setPower(gamepad1.right_trigger);
                robot.arm2.setPower(gamepad1.right_trigger);
            } else if (gamepad1.left_trigger>0) {
                robot.arm1.setPower(-gamepad1.left_trigger);
                robot.arm2.setPower(-gamepad1.left_trigger);
            } else {
                robot.arm1.setPower(0);
                robot.arm2.setPower(0);
            }

            if (gamepad2.left_trigger>0) {
                robot.wrist.setPower(.6);
            } else if (gamepad2.right_trigger>0) {
                robot.wrist.setPower(-.6);
            } else {
                robot.wrist.setPower(0);
            }
            if(gamepad2.right_bumper){
                robot.claw2.setPosition(1);
            }
            if(gamepad2.left_bumper){
                robot.claw2.setPosition(0);
            }
            if(gamepad1.right_bumper){
                robot.plane.setPosition(1);
            }
            if(gamepad1.left_bumper){
                robot.plane.setPosition(0);
            }
        }
    }
}
