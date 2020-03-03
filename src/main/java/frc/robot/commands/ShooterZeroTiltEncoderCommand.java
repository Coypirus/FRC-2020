package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShooterZeroTiltEncoderCommand extends Command{
    public ShooterZeroTiltEncoderCommand(){

    }
    @Override
    protected void initialize(){
   
    }

    @Override
    protected void execute(){
        Robot.shooterSubsystem.zeroTiltFangsEncoder();
    }


    @Override
    protected boolean isFinished(){
        return true;
    }

    @Override
    protected void end() {
    }
  
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }

}
