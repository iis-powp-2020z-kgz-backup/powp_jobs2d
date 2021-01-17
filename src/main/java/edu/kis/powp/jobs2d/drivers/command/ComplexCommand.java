package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand {

    ArrayList<DriverCommand> commands = new ArrayList<DriverCommand>();

    public void add(DriverCommand command) {
        commands.add(command);
    }

    @Override
    public void execute(Job2dDriver device) {
        for (DriverCommand command : commands) {
            command.execute(device);
        }

    }

}
