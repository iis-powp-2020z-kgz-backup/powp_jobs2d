package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private int x_point, y_point;
    private Job2dDriver job2dDriver;

    public SetPositionCommand(Job2dDriver job2dDriver, int x, int y) {
        this.job2dDriver = job2dDriver;
        this.x_point = x;
        this.y_point = y;
    }

    @Override public void execute() {
        job2dDriver.setPosition(x_point, y_point);
    }
}
