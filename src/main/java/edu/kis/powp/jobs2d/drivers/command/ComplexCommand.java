package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ComplexCommand implements DriverCommand {
    ArrayList<DriverCommand> commandsList = new ArrayList<>();
        
    @Override
    public void execute(Job2dDriver driver) {
        for(DriverCommand command : commandsList) {
            command.execute(driver);
        }
    }

    public void addCommand(DriverCommand newCommand) {
        commandsList.add(newCommand);
    }

}
