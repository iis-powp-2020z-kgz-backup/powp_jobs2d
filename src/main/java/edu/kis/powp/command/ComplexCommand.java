package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand implements DriverCommand{

    private final List<DriverCommand> commandsList;

    public ComplexCommand(List<DriverCommand> commandsList){
        this.commandsList = commandsList;
    }

    @Override public void execute() {
        for (DriverCommand command:commandsList){
            command.execute();
        }
    }
}
