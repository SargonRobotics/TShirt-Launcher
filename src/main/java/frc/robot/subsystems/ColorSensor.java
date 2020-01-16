package frc.robot.subsystems;

import com.revrobotics.ColorSensorV3;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants

public class ColorSensor extends SubsystemBase 
{
    private final I2C.Port i2cPort = I2C.Port.kOnboard;
    private final ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);


@Override
  public void periodic() 
  {
    Color detectedColor = m_colorSensor.getColor();
    double IR = m_colorSensor.getIR();

    SmartDashboard.putNumber("Red", detectedColor.red);
    SmartDashboard.putNumber("Green", detectedColor.green);
    SmartDashboard.putNumber("Blue", detectedColor.blue);
    SmartDashboard.putNumber("IR", IR);

    int proximity = m_colorSensor.getProximity();
    SmartDashboard.putNumber("Proximity", proximity);
  }
}

  public string matchColor(Color target)
  {
    String colorName = "???";

    switch (target)
    {
      case (target.red >= redThreshold): colorName = "Red"; break;
      case (target.green >= greenThreshold): colorName = "Green"; break;
      case (target.blue >= blueThreshold): colorName = "Blue"; break;
      case (target.yellow >= yellowThreshold): colorName = "Yellow"; break;
      default: colorName = "Unknown"; break;
    }


  }