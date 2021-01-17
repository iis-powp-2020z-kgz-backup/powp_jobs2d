package edu.kis.powp.jobs2d.drivers.command;

public class FigureFactory {
    public static ComplexCommand getRectangleCommand() {
        ComplexCommand complexCommand = new ComplexCommand();
        
        complexCommand.addCommand(new SetPositionCommand(100, 100));
        complexCommand.addCommand(new OperateToCommand(-100, 100));
        complexCommand.addCommand(new OperateToCommand(-100, -100));
        complexCommand.addCommand(new OperateToCommand(100, -100));
        complexCommand.addCommand(new OperateToCommand(100, 100));

        return complexCommand;
    }

    public static ComplexCommand getTriangleCommand() {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(100, 100));
        complexCommand.addCommand(new OperateToCommand(200, 0));
        complexCommand.addCommand(new OperateToCommand(0, 0));

        return complexCommand;
    }

    public static ComplexCommand getPlusSignCommand() {
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(200, 0));
        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(0, 200));
        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(-200, 0));
        complexCommand.addCommand(new SetPositionCommand(0, 0));
        complexCommand.addCommand(new OperateToCommand(0, -200));
        complexCommand.addCommand(new SetPositionCommand(0, 0));

        return complexCommand;
    }
}
