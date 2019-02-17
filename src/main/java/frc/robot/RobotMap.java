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
  //Constant values for motor ports
  public static final int leftMotorPort1 = 0;
  public static final int leftMotorPort2 = 1;
  public static final int rightMotorPort1 = 2;
  public static final int rightMotorPort2 = 3;
  public static final int armMotorPort = 4;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //Constant values for Joystick ports
  public  static final int joystickPortLeft = 0;
  public static final int joystickPortRight = 1;
 
  //Jostick button Values for Arm
  public static final int joyStickArmTrigger = 2;
  public static final int joyStickArmSolenoidTrigger = 1;
  public static final int joyStickArmCompressor = 1;
  public static final int joyStickArmFoward = 6;
  public static final int joyStickArmBack = 5;
  //PCM VALUES
  public static final int SOLENOID_VALUE = 0;
  public static final int SOLENOID_VALUE1 = 1;
  //Motor Constants
  public static final double leftM = 1;
  public static final double rightM = 2.5;
  
  









}