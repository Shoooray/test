package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TestSubsystem extends SubsystemBase {
    
    private TalonFX testMotor = new TalonFX(Constants.testMotor.TEST_MOTOR_ID);

    public TestSubsystem() {
        
    }

    public void testSpeed() {
        testMotor.set(1);
    }

    public void intakePivot() {
        
    }

    public void testEncoder() {
        testMotor.setPosition(1);
    }

}
