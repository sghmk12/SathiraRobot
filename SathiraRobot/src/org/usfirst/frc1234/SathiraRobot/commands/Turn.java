package org.usfirst.frc1234.SathiraRobot.commands;

import org.usfirst.frc1234.SathiraRobot.Robot;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.PIDSource;

public class Turn extends Command{

	private PIDController pid;
	
	public Turn(double angle){
		requires(Robot.driveTrain);
		pid = new PIDController(-0.5,0,0,new PIDSource(){
			public double pidGet(){
				return Robot.driveTrain.getHeading();
			}
		}, new PIDOutput(){
			public void pidWrite(double d){
				Robot.driveTrain.driveCurve(0.1, d);
				SmartDashboard.putNumber("d", d);
			}
		});
		
		pid.setAbsoluteTolerance(0.015);
		pid.setSetpoint(angle);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.driveTrain.reset();
		pid.reset();
		pid.enable();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return pid.onTarget();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		pid.disable();
		Robot.driveTrain.drive(0, 0);
	}

	@Override
	protected void interrupted() {
		end();
		
	}

}
