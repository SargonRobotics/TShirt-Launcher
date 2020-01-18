package frc.robot.subsystems;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj.util.Color8Bit;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

public class ColorSensor extends SubsystemBase 
{
  private final I2C.Port i2cPort = I2C.Port.kOnboard;
  private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);


  @Override
  public void periodic() 
  {
    final Color detectedColor = m_colorSensor.getColor();
    final double IR = m_colorSensor.getIR();

    SmartDashboard.putNumber("Red", detectedColor.red);
    SmartDashboard.putNumber("Green", detectedColor.green);
    SmartDashboard.putNumber("Blue", detectedColor.blue);
    SmartDashboard.putNumber("IR", IR);

    SmartDashboard.putString("Color Name", matchColor(detectedColor));

    final int proximity = m_colorSensor.getProximity();
    SmartDashboard.putNumber("Proximity", proximity);
  }



  public String matchColor(final Color target)
  {
    String colorName = "Unknown";

    if(Constants.redThreshold.inThreshhold(target.red, target.green, target.blue))
    {
      colorName = "Red";
    }
    else if(Constants.greenThreshold.inThreshhold(target.red, target.green, target.blue))
    {
      colorName = "Green";
    }
    else if(Constants.blueThreshold.inThreshhold(target.red, target.green, target.blue))
    {
      colorName = "Blue";
    }
    else if(Constants.yellowThreshold.inThreshhold(target.red, target.green, target.blue))
    {
      colorName = "Yellow";
    }

    return colorName;
  }
}