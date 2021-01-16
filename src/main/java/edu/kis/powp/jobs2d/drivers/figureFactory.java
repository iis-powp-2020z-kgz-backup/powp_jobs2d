package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.cos;
import static java.lang.Math.sin;



public class figureFactory {
    public static DriverCommand rectangleFactory(DriverManager driverManager){
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),250,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),250,250));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,250));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,0));

        return new ComplexCommand(commandList);
    }

    public static DriverCommand triangleFactory(DriverManager driverManager){
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),100,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),100,100));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,0));

        return new ComplexCommand(commandList);
    }

    public static DriverCommand trapeziumFactory(DriverManager driverManager){
        List<DriverCommand> commandList = new ArrayList<>();

        commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),200,0));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),140,80));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),60,80));
        commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),0,0));

        return new ComplexCommand(commandList);
    }

    public static DriverCommand circleFactory(DriverManager driverManager){
        List<DriverCommand> commandList = new ArrayList<>();
        commandList.add(new SetPositionCommand(driverManager.getCurrentDriver(),0,0));
        for(int i=0;i<360;i++){
            commandList.add(new OperateToCommand(driverManager.getCurrentDriver(),100*(int)cos(i),100*(int)sin(i)));
        }
        return new ComplexCommand(commandList);
    }


}
