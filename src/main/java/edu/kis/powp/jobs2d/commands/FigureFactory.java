package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class FigureFactory {

    public ArrayList<DriverCommand> figureCommands(int figureNumber, Job2dDriver job2dDriver) {
        switch(figureNumber) {
            case 1:
                return getSquare(job2dDriver);
            case 2:
                return getTriangle(job2dDriver);
            case 3:
                return getHome(job2dDriver);
            default:
                return new ArrayList<>();
        }
    }

    private ArrayList<DriverCommand> getHome(Job2dDriver job2dDriver) {

        ArrayList<DriverCommand> driverCommands = new ArrayList<>();

        driverCommands.add(new SetPositionCommand(0,0, job2dDriver));
        driverCommands.add(new OperateToCommand(0,-100, job2dDriver));
        driverCommands.add(new OperateToCommand(150,-100, job2dDriver));
        driverCommands.add(new OperateToCommand(150,0, job2dDriver));
        driverCommands.add(new OperateToCommand(0,0, job2dDriver));

        driverCommands.add(new SetPositionCommand(0,-100, job2dDriver));
        driverCommands.add(new OperateToCommand(75,-150, job2dDriver));
        driverCommands.add(new OperateToCommand(150,-100, job2dDriver));

        driverCommands.add(new SetPositionCommand(25,-40, job2dDriver));
        driverCommands.add(new OperateToCommand(25,-70, job2dDriver));
        driverCommands.add(new OperateToCommand(55,-70, job2dDriver));
        driverCommands.add(new OperateToCommand(55,-40, job2dDriver));
        driverCommands.add(new OperateToCommand(25,-40, job2dDriver));

        driverCommands.add(new SetPositionCommand(85,0, job2dDriver));
        driverCommands.add(new OperateToCommand(85,-60, job2dDriver));
        driverCommands.add(new OperateToCommand(120,-60, job2dDriver));
        driverCommands.add(new OperateToCommand(120,0, job2dDriver));

        return driverCommands;

    }

    private ArrayList<DriverCommand> getTriangle(Job2dDriver job2dDriver) {

        ArrayList<DriverCommand> driverCommands = new ArrayList<>();

        driverCommands.add(new SetPositionCommand(0,0, job2dDriver));
        driverCommands.add(new OperateToCommand(50,-75, job2dDriver));
        driverCommands.add(new OperateToCommand(100,0, job2dDriver));
        driverCommands.add(new OperateToCommand(0,0, job2dDriver));

        return driverCommands;

    }

    private ArrayList<DriverCommand> getSquare(Job2dDriver job2dDriver) {
        ArrayList<DriverCommand> driverCommands = new ArrayList<>();

        driverCommands.add(new SetPositionCommand(0,0, job2dDriver));
        driverCommands.add(new OperateToCommand(0,100, job2dDriver));
        driverCommands.add(new OperateToCommand(100,100, job2dDriver));
        driverCommands.add(new OperateToCommand(100,0, job2dDriver));
        driverCommands.add(new OperateToCommand(0,0, job2dDriver));

        return driverCommands;
    }


}
