package org.usfirst.frc.team2335.robot.subsystems;

import org.usfirst.frc.team2335.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem
{
	RobotDrive drive;
	
	public DriveTrain()
	{
		drive = new RobotDrive(Robot.FRONT_LEFT_MOTOR, Robot.BACK_LEFT_MOTOR, Robot.FRONT_RIGHT_MOTOR, Robot.BACK_RIGHT_MOTOR);
		drive.setInvertedMotor(MotorType.kFrontLeft, true);
		drive.setInvertedMotor(MotorType.kRearLeft, true);
	}
	
	public void drive(double moveVal, double rotateVal)
	{
		drive.arcadeDrive(moveVal, rotateVal);
	}
	
    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

