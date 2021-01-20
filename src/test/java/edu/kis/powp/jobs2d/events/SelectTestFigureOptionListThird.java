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

public class SelectTestFigureOptionListThird implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListThird(DriverManager driverManagerVariable) {
        driverManager = driverManagerVariable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = driverManager.getCurrentDriver();
        List<DriverCommand> clist = new ArrayList<>();
        clist.add(0, new SetPositionCommand(0, 0, driver));
        clist.add(1, new OperateToCommand(0, 100, driver));
        clist.add(2, new OperateToCommand(100, 100, driver));
        clist.add(3, new OperateToCommand(100, 0, driver));
        clist.add(4, new OperateToCommand(0, 0, driver));

        new ComplexCommand(clist).execute();
    }
}
