package edu.kis.powp.jobs2d.commands;

import edu.kis.powp.jobs2d.Job2dDriver;

public class FigureFactory {
    public static ComplexCommand getTrapeze(Job2dDriver job2dDriver){
        ComplexCommand commands = new ComplexCommand();
        commands.add(new SetPositionCommand(job2dDriver,0, 0));
        commands.add(new OperateToCommand(job2dDriver, 50, -100));
        commands.add(new OperateToCommand(job2dDriver, 200, -100));
        commands.add(new OperateToCommand(job2dDriver, 250, 0));
        commands.add(new OperateToCommand(job2dDriver, 0, 0));

        return commands;
    }

    public static ComplexCommand getDiamod(Job2dDriver job2dDriver){
        ComplexCommand commands = new ComplexCommand();
        commands.add(new SetPositionCommand(job2dDriver,-50, 0));
        commands.add(new OperateToCommand(job2dDriver, 0, -50));
        commands.add(new OperateToCommand(job2dDriver, 100, -50));
        commands.add(new OperateToCommand(job2dDriver, 150, 0));
        commands.add(new OperateToCommand(job2dDriver, 50, 200));
        commands.add(new OperateToCommand(job2dDriver, -50, 0));

        return commands;
    }

    public static ComplexCommand getPizza(Job2dDriver job2dDriver){
        ComplexCommand commands = new ComplexCommand();
        commands.add(new SetPositionCommand(job2dDriver,0, -100));
        commands.add(new OperateToCommand(job2dDriver, 0, 100));
        commands.add(new SetPositionCommand(job2dDriver,-100, 0));
        commands.add(new OperateToCommand(job2dDriver, 100, 0));
        commands.add(new SetPositionCommand(job2dDriver,-70, -70));
        commands.add(new OperateToCommand(job2dDriver, 70, 70));
        commands.add(new SetPositionCommand(job2dDriver,70, -70));
        commands.add(new OperateToCommand(job2dDriver, -70, 70));
        commands.add(new OperateToCommand(job2dDriver, 0, 100));
        commands.add(new OperateToCommand(job2dDriver, 70, 70));
        commands.add(new OperateToCommand(job2dDriver, 100, 0));
        commands.add(new OperateToCommand(job2dDriver, 70, -70));
        commands.add(new OperateToCommand(job2dDriver, 0, -100));
        commands.add(new OperateToCommand(job2dDriver, -70, -70));
        commands.add(new OperateToCommand(job2dDriver, -100, 0));
        commands.add(new OperateToCommand(job2dDriver, -70, 70));

        return commands;
    }
}
