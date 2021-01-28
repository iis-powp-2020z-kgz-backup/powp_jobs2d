package edu.kis.powp.jobs2d.commands;

import java.util.ArrayList;

public class ComplexCommand implements DriverCommand {
    private ArrayList<DriverCommand> commands = new ArrayList<>();

    public void add(DriverCommand command){
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(DriverCommand::execute);
    }
}
