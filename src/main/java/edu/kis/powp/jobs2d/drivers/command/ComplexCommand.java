package edu.kis.powp.jobs2d.drivers.command;

import java.util.List;

public class ComplexCommand implements DriverCommand{

    List<DriverCommand> list;

    public ComplexCommand(List<DriverCommand> clist) {
        this.list = clist;
    }

    @Override
    public void execute() {
        for (DriverCommand driverCommand : list){
            driverCommand.execute();
        }
    }
}
