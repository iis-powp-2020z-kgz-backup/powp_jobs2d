package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> commandList = new ArrayList<>();


    public ComplexCommand(List<DriverCommand> commandList) {
        this.commandList = commandList;
    }

    public ComplexCommand() {
    }

    public void addCommand(DriverCommand newCommand) {
        this.commandList.add(newCommand);
    }

    @Override
    public void execute() {
        commandList.forEach(DriverCommand::execute);
    }
}
