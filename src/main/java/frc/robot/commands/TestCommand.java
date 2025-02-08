package frc.robot.commands;

import com.reduxrobotics.sensors.canandmag.Canandmag;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.TestSubsystem;

public class TestCommand extends Command {

    private final TestSubsystem test;

    private final Canandmag testEncoder = new Canandmag(Constants.testMotor.TEST_ENCODER_ID);

    public TestCommand(TestSubsystem test) {
        this.test = test;
        addRequirements(test);
    } 
    
    @Override
    public void initialize() {
        test.testSpeed();
    }

    @Override
    public void execute() {

    }

    @Override
    public boolean isFinished() {
        if (testEncoder.getPosition() == 3) {
            return true;
        }
        return false;
    }

    @Override
    public void end(boolean interupted) {
        test.testStop();
    }
    
}
