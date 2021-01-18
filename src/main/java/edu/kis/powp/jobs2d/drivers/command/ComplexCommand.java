package edu.kis.powp.jobs2d.drivers.command;

import java.util.List;

public class ComplexCommand implements DriverCommand {

    public List<DriverCommand> commandsList;

    public ComplexCommand(List<DriverCommand> list){
        this.commandsList = list;
    }

    @Override public void execute() {
        for (DriverCommand command:commandsList){
            command.execute();
        }
    }
}
