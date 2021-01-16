package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    public SetPositionCommand(int x, int y, Job2dDriver job2dDriver) {
        this.x = x;
        this.y = y;
        this.job2dDriver = job2dDriver;
    }

    private int x;
    private int y;
    Job2dDriver job2dDriver;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public void execute() {
        job2dDriver.setPosition(x, y);
    }
}
