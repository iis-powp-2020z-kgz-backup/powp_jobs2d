package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.TestFigureCommands;

public class SelectTestCommandOptionListener implements ActionListener {

	private DriverManager driverManager;
	private TestFigureCommands.CommandTemplate figureCommand;

	public SelectTestCommandOptionListener(DriverManager driverManager, TestFigureCommands.CommandTemplate template) {
		this.driverManager = driverManager;
		figureCommand = template;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		figureCommand.invoke(driverManager.getCurrentDriver());
	}
}
