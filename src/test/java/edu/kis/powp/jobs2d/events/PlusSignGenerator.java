package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.FigureFactory;

public class PlusSignGenerator implements ActionListener {
	private DriverManager driverManager;

	public PlusSignGenerator(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FigureFactory.getPlusSignCommand().execute(driverManager.getCurrentDriver());
	}
}
