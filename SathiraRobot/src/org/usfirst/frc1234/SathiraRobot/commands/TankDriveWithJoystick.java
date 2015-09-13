package org.usfirst.frc1234.SathiraRobot.commands;

import org.usfirst.frc1234.SathiraRobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TankDriveWithJoystick extends Command{

	public TankDriveWithJoystick (){
		requires(Robot.driveTrain);
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.driveTrain.tankDrive(Robot.oi.getJoystick());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.driveTrain.drive(0,0);
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		end();
	}

}
