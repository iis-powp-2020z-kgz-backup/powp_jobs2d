package edu.kis.powp.jobs2d.events;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

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

        List<DriverCommand> driverCommands = Arrays.asList(
                new SetPositionCommand(currentDriver, -200, 100),
                new OperateToCommand(currentDriver, 200, 100),
                new OperateToCommand(currentDriver, 200, -100),
                new OperateToCommand(currentDriver, -200, -100),
                new OperateToCommand(currentDriver, -200, 100)
        );

        new ComplexCommand(driverCommands).execute();
    }
}
