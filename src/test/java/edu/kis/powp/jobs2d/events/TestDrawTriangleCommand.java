package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.FigureFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class TestDrawTriangleCommand implements ActionListener{

    private DriverManager driverManager;

	public TestDrawTriangleCommand(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        FigureFactory.drawTriangle().execute(driverManager.getCurrentDriver());
	}
}