// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1234.SathiraRobot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController clawMotor;
    public static SpeedController wristMotor;
    public static AnalogPotentiometer wristPot;
    public static AnalogPotentiometer elevatorPot;
    public static SpeedController elevatorMotor;
    public static SpeedController driveTrainLeftFront;
    public static SpeedController driveTrainLeftRear;
    public static SpeedController driveTrainRightFront;
    public static SpeedController driveTrainRightRear;
    public static RobotDrive driveTrainRobotDrive41;
    public static AnalogInput driveTrainUltrasonic;
    public static Encoder driveTrainLeftEncoder;
    public static Encoder driveTrainRightEncoder;
    public static Gyro driveTrainGyro;
   // public static DigitalInput clawContact;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
    	clawMotor = new Victor(7);
        
     //   clawContact = new DigitalInput(5);
        
        LiveWindow.addActuator("Claw", "Motor", (Victor) clawMotor);
        
        wristMotor = new Victor(6);
        LiveWindow.addActuator("Wrist", "Motor", (Victor) wristMotor);
        
        wristPot = new AnalogPotentiometer(3, 1.0, 0.0);
        LiveWindow.addSensor("Wrist", "Pot", wristPot);
        
        elevatorPot = new AnalogPotentiometer(2, 1.0, 0.0);
        LiveWindow.addSensor("Elevator", "Pot", elevatorPot);
        
        elevatorMotor = new Victor(5);
        LiveWindow.addActuator("Elevator", "Motor", (Victor) elevatorMotor);
        
        driveTrainLeftFront = new Talon(1);
        LiveWindow.addActuator("Drive Train", "LeftFront", (Talon) driveTrainLeftFront);
        
        driveTrainLeftRear = new Talon(2);
        LiveWindow.addActuator("Drive Train", "LeftRear", (Talon) driveTrainLeftRear);
        
        driveTrainRightFront = new Talon(3);
        LiveWindow.addActuator("Drive Train", "RightFront", (Talon) driveTrainRightFront);
        
        driveTrainRightRear = new Talon(4);
        LiveWindow.addActuator("Drive Train", "RightRear", (Talon) driveTrainRightRear);
        
        driveTrainUltrasonic = new AnalogInput(6);
        LiveWindow.addSensor("DriveTrain", "Ultrasonic", driveTrainUltrasonic);
        
        driveTrainLeftEncoder = new Encoder(1,2,false,EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain","LeftEncoder",driveTrainLeftEncoder);

        driveTrainRightEncoder = new Encoder(3,4,false,EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain","RightEncoder",driveTrainRightEncoder);
        
        driveTrainGyro = new Gyro(1);
        LiveWindow.addSensor("DriveTrain", "Gyro", driveTrainGyro);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainLeftFront, driveTrainLeftRear,
              driveTrainRightFront, driveTrainRightRear);
        
        //driveTrainRobotDrive41.setSafetyEnabled(false);
       // driveTrainRobotDrive41.setExpiration(0.1);
       // driveTrainRobotDrive41.setSensitivity(0.5);
       // driveTrainRobotDrive41.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
