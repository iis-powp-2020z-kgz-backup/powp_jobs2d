package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private int x;
    private int y;

    private Job2dDriver driver;

    public SetPositionCommand(Job2dDriver d, int a, int b){
        driver = driver;
        x = a;
        y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void execute() {
        driver.setPosition(x,y);
    }
}
