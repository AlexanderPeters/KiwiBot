
package org.usfirst.frc.team3140.robot.subsystems;

import org.usfirst.frc.team3140.robot.RobotMap;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    
	TalonSRX leftmotor = new TalonSRX(RobotMap.leftmotora);
	TalonSRX rightmotor = new TalonSRX(RobotMap.rightmotora);
	
    public void initDefaultCommand() {
    
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

