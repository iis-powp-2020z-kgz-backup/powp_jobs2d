package edu.kis.powp.jobs2d.events;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.CommandComplex;
import edu.kis.powp.jobs2d.drivers.command.CommandDriver;
import edu.kis.powp.jobs2d.drivers.command.CommandOperateTo;
import edu.kis.powp.jobs2d.drivers.command.CommandSetPosition;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class SelectTestFigure3OptionListener implements ActionListener {

    private DriverManager driverManager;
    public SelectTestFigure3OptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        List<CommandDriver> driverCommands = Arrays.asList(
                new CommandSetPosition(200, 0, currentDriver),
                new CommandOperateTo(200, -200, currentDriver),
                new CommandOperateTo(-200, -200, currentDriver),
                new CommandOperateTo(200, 0, currentDriver)
        );

        new CommandComplex(driverCommands).execute();
    }
}