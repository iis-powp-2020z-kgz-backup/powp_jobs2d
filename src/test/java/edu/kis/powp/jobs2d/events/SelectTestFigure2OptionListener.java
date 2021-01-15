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

public class SelectTestFigure2OptionListener implements ActionListener {

    private DriverManager driverManager;
    public SelectTestFigure2OptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        List<CommandDriver> driverCommands = Arrays.asList(
                new CommandSetPosition(-200, 100, currentDriver),
                new CommandOperateTo(200, 100, currentDriver),
                new CommandOperateTo(200, -100, currentDriver),
                new CommandOperateTo(-200, -100, currentDriver),
                new CommandOperateTo(-200, 100, currentDriver)
        );

        new CommandComplex(driverCommands).execute();
    }
}