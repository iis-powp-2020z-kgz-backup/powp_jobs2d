package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int startX, startY;

    private Job2dDriver driver;

    public OperateToCommand(Job2dDriver d, int x, int y){
        driver = d;
        startX = x;
        startY = y;
    }

    @Override
    public void execute() {
        driver.operateTo(startX,startY);
    }
}
