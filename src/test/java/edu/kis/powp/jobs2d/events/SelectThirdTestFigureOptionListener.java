package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SelectThirdTestFigureOptionListener implements ActionListener {
    private final DriverManager driverManager;

    public SelectThirdTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver currentDriver = driverManager.getCurrentDriver();

        List<DriverCommand> driverCommandList = new ArrayList<>();
        driverCommandList.add(0, new SetPositionCommand(currentDriver, 0, 0));
        driverCommandList.add(1, new OperateToCommand(currentDriver, 200, 0));
        driverCommandList.add(2, new OperateToCommand(currentDriver, 100, 100));
        driverCommandList.add(3, new OperateToCommand(currentDriver, 0, 0));

        new ComplexCommand(driverCommandList).execute();

    }
}
