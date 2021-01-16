package edu.kis.powp.jobs2d.drivers.command;

public class FigureCommandFactory {
    public static ComplexCommand getSquareCommand() {
        ComplexCommand procedure = new ComplexCommand();
        procedure.addCommand(new SetPositionCommand(-150,-150));
        procedure.addCommand(new OperateToCommand(-150,150));
        procedure.addCommand(new OperateToCommand(150,150));
        procedure.addCommand(new OperateToCommand(150,-150));
        procedure.addCommand(new OperateToCommand(-150,-150));
        return procedure;
    }

    public static ComplexCommand getTriangleCommand() {
        ComplexCommand procedure = new ComplexCommand();
        procedure.addCommand(new SetPositionCommand(0,0));
        procedure.addCommand(new OperateToCommand(100,150));
        procedure.addCommand(new OperateToCommand(200,0));
        procedure.addCommand(new OperateToCommand(0,0));
        return procedure;
    }
}