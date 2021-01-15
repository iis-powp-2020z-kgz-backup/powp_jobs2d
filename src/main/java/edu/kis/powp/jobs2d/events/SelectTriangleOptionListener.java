package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.commands.ComplexCommand;
import edu.kis.powp.jobs2d.commands.DriverCommand;
import edu.kis.powp.jobs2d.commands.OperateToCommand;
import edu.kis.powp.jobs2d.commands.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SelectTriangleOptionListener implements ActionListener {
    private DriverManager driverManager;

    public SelectTriangleOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = driverManager.getCurrentDriver();

        List<DriverCommand> drawTriangle = new ArrayList<>();
        drawTriangle.add(new SetPositionCommand(0,0, driver));
        drawTriangle.add(new OperateToCommand(100,0, driver));
        drawTriangle.add(new OperateToCommand(0,-180, driver));
        drawTriangle.add(new OperateToCommand(0,0, driver));

        new ComplexCommand(drawTriangle).execute();
    }
}
