/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * OPERATOR INPUT This class is the glue that binds the controls on the physical
 * operator interface to the commands and command groups that allow control of
 * the robot.
 */
public class OI {
  public Joystick leftJoystick = new Joystick(RobotMap.leftJoystickPort);
  Button stopButton = new JoystickButton(leftJoystick, 1);
  Button showAllButton = new JoystickButton(leftJoystick, 2);
  Button zeroEncoderButton = new JoystickButton(leftJoystick, 3);
  Button zeroYawButton = new JoystickButton(leftJoystick, 4);
  Button turnAbsoluteTestButton = new JoystickButton(leftJoystick, 5);
  Button climberClimbButton = new JoystickButton(leftJoystick, 6);
  Button testMotionMagicButton = new JoystickButton(leftJoystick , 7);
  Button spin = new JoystickButton(leftJoystick, 8);
  Button zeroControlPanelEncoderButton = new JoystickButton(leftJoystick, 9);
  Button setControlPanelPositionButton = new JoystickButton(leftJoystick, 10);
  Button moveControlPanelAlongColorPathButton = new JoystickButton(leftJoystick, 11);
  Button shooterManualControlButton = new JoystickButton(leftJoystick, 12);

  public OI() { // Setup All Commands Here
    zeroEncoderButton.whenPressed(new DriveZeroEncodersCommand());
    zeroYawButton.whenPressed(new NavXZeroYawCommand());
    testMotionMagicButton.whenPressed(new DriveForwardCommand(50000));
    spin.whenPressed(new DriveTurnCommand(90));
    stopButton.whileActive(new DriveStopCommand());
    showAllButton.whileActive(new SmartDashboardUpdateAllCommand());
    turnAbsoluteTestButton.whenActive(new DriveTurnAbsoluteCommand(90));
    zeroControlPanelEncoderButton.whenPressed(new ControlPanelZeroEncoderCommand());
    setControlPanelPositionButton.whenPressed(new ControlPanelMoveToTargetCommand(3.5));
    moveControlPanelAlongColorPathButton.whenPressed(new ControlPanelMoveTargetColorCommand());
    moveControlPanelAlongColorPathButton.whenPressed(new ControlPanelMoveTargetColorCommand());
    shooterManualControlButton.whenPressed(new ShootManuallyCommand());
    
  }
}
