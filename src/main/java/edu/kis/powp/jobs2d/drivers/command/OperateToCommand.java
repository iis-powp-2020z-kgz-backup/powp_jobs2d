package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    OperateToCommand(int n_x, int n_y) {
        x = n_x;
        y = n_y;
    }

    @Override
    public void execute(Job2dDriver driverContext) {
        driverContext.operateTo(x,y);
    }

    private int x;
    private int y;
}
