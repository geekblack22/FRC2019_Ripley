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
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;


/**
 *This controls the motor in the arm
 @author Yveder Joseph
 */
public class ArmRotate extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  //public Spark armMotor = new Spark(RobotMap.armMotorPort);
  public DoubleSolenoid armSolenoid = new DoubleSolenoid(RobotMap.SOLENOID_VALUE2, RobotMap.SOLENOID_VALUE3);

  public void armExtend(){
    //armMotor.set(.75);
    armSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void ArmRetract(){
    //armMotor.set(-.75); 
    armSolenoid.set(DoubleSolenoid.Value.kReverse);
  }
  public void ArmStop(){
    //armMotor.set(0);
    armSolenoid.set(DoubleSolenoid.Value.kOff);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
   
  }
}
