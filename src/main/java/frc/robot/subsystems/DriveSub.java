/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
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
  public Spark leftMotor = new Spark(RobotMap.leftMotorPort);
  public Spark rightMotor = new Spark(RobotMap.rightMotorPort);

  public DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);

  public void DriveSub(){

  }
  public void manualControl(double leftInput, double rightInput){
    drive.tankDrive(leftInput, rightInput);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveManualCommand());
  }

  
  }

