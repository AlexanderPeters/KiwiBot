
package org.usfirst.frc.team3140.robot.subsystems;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem {
    
	TalonSRX leftmotor = new TalonSRX(3);
	TalonSRX rightmotor = new TalonSRX(1);
	
    public void initDefaultCommand() {
    
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

