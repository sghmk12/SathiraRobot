package org.usfirst.frc1234.SathiraRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Place extends CommandGroup{

	public Place (){
		addSequential(new SetWristSetPoint(0));
		addSequential(new OpenClaw());
	}
}
