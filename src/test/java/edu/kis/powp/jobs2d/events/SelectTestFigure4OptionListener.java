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

public class SelectTestFigure4OptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigure4OptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        List<DriverCommand> commandsList = new ArrayList<>();
        commandsList.add(0, new SetPositonCommand(currentDriver,100,0));
        commandsList.add(1,new OperateToCommand(currentDriver,150,100));
        commandsList.add(2,new OperateToCommand(currentDriver,100,200));
        commandsList.add(3,new OperateToCommand(currentDriver,50,100));
        commandsList.add(4,new OperateToCommand(currentDriver,100,0));

        new ComplexCommand(commandsList).execute();
    }
}
