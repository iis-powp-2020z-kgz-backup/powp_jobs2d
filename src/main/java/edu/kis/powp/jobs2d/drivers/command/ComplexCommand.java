package edu.kis.powp.jobs2d.drivers.command;

import java.util.List;

public class ComplexCommand implements DriverCommand {

    private final List<DriverCommand> driverCommandList;

    public ComplexCommand(List<DriverCommand> driverCommandList) {
        this.driverCommandList = driverCommandList;
    }

    @Override
    public void execute() {
        driverCommandList.forEach(DriverCommand::execute);
    }
}
