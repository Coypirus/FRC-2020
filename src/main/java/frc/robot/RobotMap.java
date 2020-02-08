/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.

  // Drivetrain Motor Controllers
  public final static int frontLeftDriveMotorController = 1;
  public final static int backLeftDriveMotorController = 2;
  public final static int frontRightDriveMotorController = 3;
  public final static int backRightDriveMotorController = 4;

  // Intake motor controllers
  public final static int intakeMotor1Controller = 8;
  public final static int intakeMotor2Controller = 9;

  // Shooter motor controllers
  public final static int shooterWheelMotorController = 5;
  public final static int shooterPanMotorController = 6;
  public final static int ShooterTiltMotorController = 7;

  // Control panel constants
  // TODO: Get actual motor ID
  public static final int diskSpinnerMotorID = 52;
  //quadrature motor controller ticks per revolution
  public static final int quadratureEncoderTicksPerRev = 178;
  // diameter of the wheel which spins the control panel wheel, in cm
  public static final double diskSpinnerDiameter = 81.28;
  // diameter of the control panel disk in cm
  public static final double controlPanelDiameter = 81.28;
  /** factor to indicate the direction on the motor that the encoder ticks are positive. If clockwise, keep 1; if counterclockwise, change to -1. */
  public static final int controlPanelDirectionFactor = 1;

  // Climber constants
  public final static int climberMotorController = 10;
  // public static int climberSolenoid1Channel=11;
  // public static int climberSolenoid2Channel=12;

  // Driver Input Devices
  public final static int leftJoystickPort = 0;

  // PCM forward, reverse channels for doubleSolenoids
  public static int ColorWheelSolenoidForwardChannel = 0;
  public static int ColorWheelSolenoidReverseChannel = 1;
  public static int IntakeSolenoidForwardChannel = 2;
  public static int IntakeSolenoidReverseChannel = 3;
  public static int ClimberSolenoidForwardChannel = 4;
  public static int ClimberSolenoidReverseChannel = 5;

  // ULTRASONIC CONSTANTS
  // RoboRIO channel for the ultrasonic sensor's analog input
  public static final int ultrasonicInputChannel1 = 0;
  public static final int ultrasonicInputChannel2 = 1;
  // channel on the roborio section DIO, to trigger a reading from the ultrasonic
  // sensor
  public static final int ultrasonicTriggerChannel1 = 0;
  public static final int ultrasonicTriggerChannel2 = 1;
  // minimum time to send a pulse to trigger the sensor(20 microseconds); max time
  // is 96 ms.
  public static final double ultrasonicTriggerTime = 20E-6;
  // constant conversion factor: ultrasonic sensor value to inches
  public static double ultrasonicValueToInchesConversionFactor = 0.125;
/*
   * at around 1800 mm away, the raw value was 1471, while the converted mm value was 467; this is not the right factor.
   * Therefore, the ideal conversion factorshould be between 1 and 1.5
   * 4 consistent tests (mm/raw unit ratios of 1.255,1.22,1.276, and 1.25, discarding an 0.7058 from measurements 240/340)
   *  suggest the correct factor is around 1.25
   */
  public static double ultrasonicValueToMMConversionFactor = 1.25;
  public static int falconBotSwitchPortNumber = 0;
  public static boolean isFalconBot;

  // How many encoder clicks per revolution (change to 2048 for falcon 500
  // encoders)
  public static int encoderUnitsPerShaftRotation = 4096;
  // The difference between the left and right side encoder values when the robot
  // is rotated 180 degrees
  public static int encoderUnitsPerRobotRotation = 38585;// thats the SUM of the two
  public static int cruiseVelocity = 2250;
  // MotionMagic curve smoothing parameter [0 - 8]
  public static int acceleration = 2250;
  // Allowable error to exit movement methods
  public static int defaultAcceptableError = 1000;



  // Closed loop constants
  // How long we wait for a configuration change to happen before we give up and
  // report a failure in milliseconds
  public final static int configureTimeoutMs = 30;
  // Full motor output value
  public final static int fullMotorOutput = 1023;
  // How many milliseconds between each closed loop call
  public final static int closedLoopPeriodMs = 1;
  // Motor neutral dead-band, set to the minimum 0.1%
  public final static double NeutralDeadband = 0.001;
  // MotionMagic curve smoothing parameter [0 - 8]
  public final static int smoothing = 3;
  // MotionMagic curve smoothing parameter [0 - 8]
 
  public final static double encoderUnitsPerJEMotorRotation = 178;


  /** ------- EXAMPLE OF SOME GAINS SETTINGS FOR OTHER ROBOTS ------
	 * PID Gains may have to be adjusted based on the responsiveness of control loop.
     * kF: 1023 represents output value to Talon at 100%, 6800 represents Velocity units at 100% output
     * Not all set of Gains are used in this project and may be removed as desired.
     * 
	 * 	                                    	        		  kP   kI   kD   kF               Iz    PeakOut */
  /*
	public final static Gains kGains_Distance = new Gains( 0.1, 0.0,  0.0, 0.0,            100,  0.50 );
	public final static Gains kGains_Turning  = new Gains( 2.0, 0.0,  4.0, 0.0,            200,  1.00 );
	public final static Gains kGains_Velocity = new Gains( 0.1, 0.0, 20.0, 1023.0/6800.0,  300,  0.50 );
	public final static Gains kGains_MotProf  = new Gains( 1.0, 0.0,  0.0, 1023.0/6800.0,  400,  1.00 );
  */

  // Closed loop PID parameter values TODO: replace F values with measured values
  public final static double P_0 = 0.75 * fullMotorOutput / encoderUnitsPerShaftRotation; // 75% motor output when
                                                                                          // error = one rotation
  public final static double I_0 = 0.005 * fullMotorOutput / encoderUnitsPerShaftRotation;
  public final static double D_0 = .1;
  public final static double F_0 = 0.227; // just a guesstimate
  public final static int Izone_0 = 500;
  public final static double PeakOutput_0 = 1;

  // Closed loop Aux PID parameter values
  public final static double P_1 = 0.75 * fullMotorOutput / encoderUnitsPerShaftRotation; // 75% motor output when
                                                                                          // error = one rotation
  public final static double I_1 = 0.005 * fullMotorOutput / encoderUnitsPerShaftRotation;
  public final static double D_1 = 0.1;
  public final static double F_1 = 0.227; // just a guesstimate
  public final static int Izone_1 = 500;
  public final static double PeakOutput_1 = 1;

  // ---- Flat constants, you should not need to change these ----
  // We allow either a 0 or 1 when selecting an ordinal for remote devices [You
  // can have up to 2 devices assigned remotely to a talon/victor]
  public final static int REMOTE_0 = 0;
  public final static int REMOTE_1 = 1;
  // We allow either a 0 or 1 when selecting a PID Index, where 0 is primary and 1
  // is auxiliary
  public final static int PID_PRIMARY = 0;
  public final static int PID_TURN = 1;
  // Firmware currently supports slots [0, 3] and can be used for either PID Set
  public final static int SLOT_0 = 0;
  public final static int SLOT_1 = 1;
  public final static int SLOT_2 = 2;
  public final static int SLOT_3 = 3;

  // ---- End closed loop parameter constants ----


}
