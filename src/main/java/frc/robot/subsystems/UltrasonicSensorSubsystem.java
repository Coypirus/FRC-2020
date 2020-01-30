/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import frc.robot.RobotMap;

/**
 * @see www.maxbotix.com/firstRobotics
 * sensor returns a value from 0-4095
 * factor to convert to inches: 0.125
 */
public class UltrasonicSensorSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final AnalogInput ultrasonic1 = new AnalogInput(RobotMap.ultrasonicInputChannel1);
  private final AnalogInput ultrasonic2 = new AnalogInput(RobotMap.ultrasonicInputChannel2);

  public double getDistanceInInches() {
    double retVal = ultrasonic1.getValue() * RobotMap.ultrasonicValueToInchesConversionFactor;
    return retVal;
  }
  public double getSensor1DistanceInMM() {
    double retVal = ultrasonic1.getValue() * RobotMap.ultrasonicValueToMMConversionFactor;
    return retVal;
  }

public double getSensor2DistanceInMM() {
  double retVal = ultrasonic2.getValue() * RobotMap.ultrasonicValueToMMConversionFactor;
  return retVal;
}

public int getSensor1DistanceInRaw() {
  int retVal = ultrasonic1.getValue();
  return retVal;
}

public int getSensor2DistanceInRaw() {
int retVal = ultrasonic2.getValue();
return retVal;
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
      
  }


}