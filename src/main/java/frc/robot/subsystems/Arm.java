/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArmOpen;
import frc.robot.commands.CompressorState;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;


/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Boolean onArm = true;
  Boolean offArm = false;
    
  Solenoid s1 = new Solenoid(RobotMap.SOLENOID_VALUE);

  public Spark armMotor = new Spark(RobotMap.armMotorPort);

  Compressor c1 = new Compressor(0);

 

  public void pushOff() {
    s1.set(onArm);
  }

  public void pullBackPiston() {
    s1.set(offArm);
  }
  public void armExtend(){
    armMotor.set(.5);
  }

  public void ArmRetract(){
    armMotor.set(-.5);
  }
  public void ArmStop(){
    armMotor.set(0);
  }
  public void CompressorOn(){
    c1.setClosedLoopControl(true);
  }
  public void CompressorOff(){
    if(c1.getPressureSwitchValue() == true){
    c1.setClosedLoopControl(false);
    }

  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new ArmOpen());
    
 
  
    
  }
}
