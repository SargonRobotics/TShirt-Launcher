package org.usfirst.frc.team2335.robot.subsystems;

import org.usfirst.frc.team2335.robot.Robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pneumatics extends Subsystem
{
	Compressor compressor;
	Solenoid solenoid;
	
	public Pneumatics()
	{
		compressor = new Compressor(0);
		solenoid = new Solenoid(Robot.SHOOT_SOLENOID);
	}
	
	public void releaseShootSolenoid()
	{
		solenoid.set(true);
	}
	
	public void closeShootSolenoid()
	{
		solenoid.set(false);
	}
    
    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

