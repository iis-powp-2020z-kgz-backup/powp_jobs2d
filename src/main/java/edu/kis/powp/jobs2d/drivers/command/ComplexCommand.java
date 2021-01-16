package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    @Override
    public void execute(Job2dDriver nDriverContext) {
        for (DriverCommand command : commandsList) {
            command.execute(nDriverContext);
        }
    }

    public void addCommand(DriverCommand nCommand) {
        commandsList.add(nCommand);
    }

    public void removeCommand(DriverCommand nCommand) {
        commandsList.remove(nCommand);
    }

    ArrayList<DriverCommand> commandsList = new ArrayList<>();
}
