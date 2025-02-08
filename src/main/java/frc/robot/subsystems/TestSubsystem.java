package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.reduxrobotics.sensors.canandmag.Canandmag;
import com.revrobotics.RelativeEncoder;

import edu.wpi.first.wpilibj.drive.RobotDriveBase.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TestSubsystem extends SubsystemBase {
    
    private TalonFX testMotor = new TalonFX(Constants.testMotor.TEST_MOTOR_ID);
    private Canandmag testEncoder = new Canandmag(Constants.testMotor.TEST_ENCODER_ID);

    public TestSubsystem() {
        
    }

    public void testSpeed() {
        testMotor.set(1);
    }

    public void testStop() {
        testMotor.set(0);
    }

    public void testEncoder() {
       
    }

}
