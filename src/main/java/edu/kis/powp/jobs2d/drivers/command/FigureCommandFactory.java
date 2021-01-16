package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class FigureCommandFactory {
    public static ComplexCommand getSquareCommand(Job2dDriver driverContext) {
        ComplexCommand procedure = new ComplexCommand();
        procedure.addCommand(new SetPositionCommand(driverContext, -150,-150));
        procedure.addCommand(new OperateToCommand(driverContext, -150,150));
        procedure.addCommand(new OperateToCommand(driverContext, 150,150));
        procedure.addCommand(new OperateToCommand(driverContext, 150,-150));
        procedure.addCommand(new OperateToCommand(driverContext, -150,-150));
        return procedure;
    }

    public static ComplexCommand getTriangleCommand(Job2dDriver driverContext) {
        ComplexCommand procedure = new ComplexCommand();
        procedure.addCommand(new SetPositionCommand(driverContext, 0,0));
        procedure.addCommand(new OperateToCommand(driverContext, 100,150));
        procedure.addCommand(new OperateToCommand(driverContext, 200,0));
        procedure.addCommand(new OperateToCommand(driverContext, 0,0));
        return procedure;
    }
}