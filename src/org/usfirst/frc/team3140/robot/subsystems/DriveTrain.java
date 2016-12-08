package org.usfirst.frc.team3140.robot.subsystems;

import org.usfirst.frc.team3140.robot.RobotMap;
import org.usfirst.frc.team3140.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public TalonSRX leftMotorA = new TalonSRX(RobotMap.leftMotorA);
	public TalonSRX rightMotorA = new TalonSRX(RobotMap.rightMotorA);
	public TalonSRX leftMotorB = new TalonSRX(RobotMap.leftMotorB);
	public TalonSRX rightMotorB = new TalonSRX(RobotMap.rightMotorB);
	
	private RobotDrive robotDrive = new RobotDrive(leftMotorA, leftMotorB, rightMotorA, rightMotorB);
	
    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
    
    public void drive(double x, double y) {
    	robotDrive.arcadeDrive(x, y, false);
    }
}