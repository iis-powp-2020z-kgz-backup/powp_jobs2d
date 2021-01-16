package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {

    private ArrayList<DriverCommand> driverCommands =  new ArrayList<DriverCommand>();
    private Job2dDriver job2dDriver;

    public ComplexCommand(ArrayList<DriverCommand> driverCommands, Job2dDriver job2dDriver) {
        this.driverCommands = driverCommands;
        this.job2dDriver = job2dDriver;
    }

    @Override
    public void execute() {
        driverCommands.forEach(DriverCommand::execute);
    }
}
