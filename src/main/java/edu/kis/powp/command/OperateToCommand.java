package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int x, y;

    private Job2dDriver driver;

    public OperateToCommand(Job2dDriver d, int x, int y){
        driver = d;
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        driver.operateTo(x,y);
    }
}
