package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand {

    ArrayList<DriverCommand> commandsArray = new ArrayList<DriverCommand>();

    public void add(DriverCommand command) {
        commandsArray.add(command);
    }


    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand command : commandsArray) {
            command.execute(driver);
        }

    }

}