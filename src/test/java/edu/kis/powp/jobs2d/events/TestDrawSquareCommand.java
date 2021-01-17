package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.FigureFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class TestDrawSquareCommand implements ActionListener{
    
    private DriverManager driverManager;

	public TestDrawSquareCommand(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        FigureFactory.drawSquare().execute(driverManager.getCurrentDriver());
	}
}
