/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PracticeDriveTrain extends SubsystemBase {
  /**
   * Creates a new ExampleSubsystem.
   */

  Spark frontLeftMotor, frontRightMotor, backLeftMotor, backRightMotor; 
  SpeedControllerGroup leftGroup, rightGroup;
  DifferentialDrive drive;

  public PracticeDriveTrain() {
    frontLeftMotor = new Spark(1); 
    frontRightMotor = new Spark(3);
    backLeftMotor = new Spark(2);
    backRightMotor = new Spark(4);

    leftGroup = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
    rightGroup = new SpeedControllerGroup(frontRightMotor, backRightMotor);
    
    drive = new DifferentialDrive(leftGroup, rightGroup);
  }
 
  public void drive(double forwardVal, double rotateVal) {
    drive.arcadeDrive(forwardVal, rotateVal);
  }

  public void stop() {
    drive.arcadeDrive(0, 0);
  }

  @Override
  public void periodic() {
    // TODO: Drive robot in this funciton instead of in teleopPeriodic
  }
}
