package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositonCommand implements DriverCommand{
    private int startX, startY;

    private Job2dDriver driver;

    public SetPositonCommand(Job2dDriver d, int x, int y){
        driver = d;
        startX = x;
        startY = y;
    }

    @Override
    public void execute() {
        driver.setPosition(startX, startY);
    }
}
