package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandOperateTo implements CommandDriver {
    private Job2dDriver job2dDriver;
    private int x;
    private int y;

    @Override public void execute() {
        job2dDriver.operateTo(x, y);
    }

    public CommandOperateTo(int x, int y, Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Job2dDriver getJob2dDriver() {
        return job2dDriver;
    }

    public void setJob2dDriver(Job2dDriver job2dDriver) {
        this.job2dDriver = job2dDriver;
    }
}
