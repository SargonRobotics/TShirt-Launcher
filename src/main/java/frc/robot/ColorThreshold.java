/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class ColorThreshold
{
    private double _redMin, _greenMin, _blueMin;

    public ColorThreshold(double redVal, double greenVal, double blueVal)
    {
        _redMin = redVal;
        _blueMin = blueVal;
        _greenMin = greenVal;
    }

    public boolean inThreshhold(double redVal, double greenVal, double blueVal)
    {
        return (redVal >= _redMin && greenVal >= _greenMin && blueVal >= _blueMin);
    }
}
