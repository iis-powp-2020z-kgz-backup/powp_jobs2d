package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositonCommand;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SelectTestFigure3OptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigure3OptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        List<DriverCommand> commandsList = new ArrayList<>();
        commandsList.add(0, new SetPositonCommand(currentDriver,0,0));
        commandsList.add(1,new OperateToCommand(currentDriver,200,0));
        commandsList.add(2,new OperateToCommand(currentDriver,150,50));
        commandsList.add(3,new OperateToCommand(currentDriver,50,50));
        commandsList.add(4,new OperateToCommand(currentDriver,0,0));

        new ComplexCommand(commandsList).execute();

    }
}
