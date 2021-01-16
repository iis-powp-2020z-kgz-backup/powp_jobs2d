package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {
    SetPositionCommand(Job2dDriver nDriverContext, int n_x, int n_y) {
        driverContext = nDriverContext;
        x = n_x;
        y = n_y;
    }

    @Override
    public void execute() {
        driverContext.setPosition(x,y);
    }

    private int x;
    private int y;
    private Job2dDriver driverContext;
}
