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
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;



/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
    
  DoubleSolenoid s1 = new DoubleSolenoid(RobotMap.SOLENOID_VALUE, RobotMap.SOLENOID_VALUE1);
  

 

  Compressor c1 = new Compressor(0);

 

  public void pushOff() {
    
    s1.set(DoubleSolenoid.Value.kForward);
    if(c1.getPressureSwitchValue()){
      CompressorOn();
    }
   
  }

  public void pullBackPiston() {
   
    s1.set(DoubleSolenoid.Value.kReverse);
   
    
    
  }
  public void solenoidOff(){
  
    s1.set(DoubleSolenoid.Value.kOff);
    
    
  }
 
  public void CompressorOn(){
    c1.setClosedLoopControl(true);
  }
 
  

  
  @Override
  public void initDefaultCommand() {
    
    // Set the default command for a subsystem here.
    
    //  setDefaultCommand(new ArmOpen());
    
    
 
  
    
  }
}
