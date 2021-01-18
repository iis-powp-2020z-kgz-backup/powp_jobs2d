package edu.kis.powp.jobs2d.drivers.command;

import java.util.List;



public class ComplexCommand implements DriverCommand{

    public List<DriverCommand> listCommands;

    public ComplexCommand(List<DriverCommand> listCommands){
        this.listCommands = listCommands;
    }

    @Override public void execute() {
        for (DriverCommand command : listCommands){
            command.execute();
        }
    }
}