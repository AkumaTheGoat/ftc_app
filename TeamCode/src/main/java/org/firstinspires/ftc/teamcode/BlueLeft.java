package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="AutoBlueLeft", group="Robot")

public class BlueLeft extends LinearOpMode {
    HMAP robot = new HMAP();
    public void runOpMode() throws InterruptedException {
        robot.initialize(hardwareMap);
        waitForStart();
        robot.LF.setPower(.7);
        robot.LB.setPower(.7);
        robot.RF.setPower(.7);
        robot.RB.setPower(.7);
        sleep(340);
        robot.LF.setPower(0);
        robot.LB.setPower(0);
        robot.RF.setPower(0);
        robot.RB.setPower(0);
        sleep(250);
        robot.LF.setPower(-1);
        robot.LB.setPower(1);
        robot.RF.setPower(1);
        robot.RB.setPower(-1);
        sleep(2400);

    }
}
