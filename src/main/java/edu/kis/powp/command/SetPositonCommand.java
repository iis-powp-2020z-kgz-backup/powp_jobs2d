package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositonCommand implements DriverCommand{
    private int x, y;

    private Job2dDriver driver;

    public SetPositonCommand(Job2dDriver d, int x, int y){
        driver = d;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        driver.setPosition(x, y);
    }
}
