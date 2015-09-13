package org.usfirst.frc1234.SathiraRobot.commands;

import org.usfirst.frc1234.SathiraRobot.Robot;

import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.command.Command;

public class SetDistanceToBox extends Command{

	private PIDController pid;
	
	public SetDistanceToBox(double distance){
		requires(Robot.driveTrain);
		pid = new PIDController(-2,0,0,new PIDSource(){
		public double pidGet(){
			return Robot.driveTrain.getDistanceToObstacle();
		}
		}, new PIDOutput(){
			public void pidWrite(double d){
				Robot.driveTrain.drive(d,d);
			}}
		);
		pid.setAbsoluteTolerance(0.01);
		pid.setSetpoint(distance);
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
		// TODO Auto-generated method stub
		end();
	}
	
}
