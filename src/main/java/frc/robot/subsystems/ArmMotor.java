/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArmRetract;
import edu.wpi.first.wpilibj.Spark;


/**
 *This controls the motor in the arm
 @author Yveder Joseph
 */
public class ArmMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public Spark armMotor = new Spark(RobotMap.armMotorPort);
  public void armExtend(){
    armMotor.set(.75);
  }

  public void ArmRetract(){
  armMotor.set(-.75); 
  }
  public void ArmStop(){
    armMotor.set(0);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
   
  }
}
