/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManualCommand;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSub extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  //create motor opjects
  public Spark leftMotor1 = new Spark(RobotMap.leftMotorPort1);
  public Spark leftMotor2 = new Spark(RobotMap.leftMotorPort2);
 
  public Spark rightMotor1 = new Spark(RobotMap.rightMotorPort1);
  public Spark rightMotor2 = new Spark(RobotMap.rightMotorPort2);
  
  public SpeedControllerGroup  leftMotors = new SpeedControllerGroup(leftMotor1 , leftMotor2);
  public SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightMotor1, rightMotor2);

  public DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);

  public void DriveSub(){

  }
  public void driveManual(double leftInput, double rightInput){
    leftInput *=-1;
    rightInput *=-1;
    if(leftInput < 0){
      leftInput = Math.pow(leftInput, 2);
      leftInput *=-1;
    }
    else {
      leftInput = Math.pow(leftInput, 2);
    }
    if(rightInput < 0){
      rightInput = Math.pow(rightInput, 2);
      rightInput *=-1;
    }
    else{
     
      rightInput = Math.pow(rightInput, 2);
    }
    

    drive.tankDrive(leftInput, rightInput);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveManualCommand());
  }

  
  }

