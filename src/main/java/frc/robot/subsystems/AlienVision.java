/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;


import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;

/**
 * Add your docs here.
 */
public class AlienVision extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Thread visionThread;

 


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    int w = 640;
    int h = 480;
    visionThread = new Thread(()-> {
      UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
      camera.setResolution(w, h);

      CvSink cvSink = CameraServer.getInstance().getVideo();
      CvSource outputStream = CameraServer.getInstance().putVideo("Target", h, w);
                
               
      Mat rect = new Mat();

      while(!Thread.interrupted()) {
        
          if(cvSink.grabFrame(rect) == 0){
            outputStream.notifyError(cvSink.getError());
            continue;
          }

          Imgproc.rectangle(rect, new Point(w / 2- 50 , h / 2 - 50),new Point(w / 2 + 50, h / 2 + 50),new Scalar(255, 255, 0), 3);
          //Imgproc.circle(rect, new Point(w/2 , h/2), 10, new Scalar(255,0,0), 5);
         
         
          
          outputStream.putFrame(rect);
      }
  
    });
    visionThread.setDaemon(true);
    visionThread.start();
  }
}
