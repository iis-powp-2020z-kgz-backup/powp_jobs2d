package edu.kis.powp.jobs2d.drivers.command;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    @Override
    public void execute() {
        for (DriverCommand command : commandsList) {
            command.execute();
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
