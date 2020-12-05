package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.TestFigureScripts;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private TestFigureScripts.FigureTemplate figureScript;

	public SelectTestFigureOptionListener(DriverManager driverManager, TestFigureScripts.FigureTemplate template) {
		this.driverManager = driverManager;
		figureScript = template;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		figureScript.invoke(driverManager.getCurrentDriver());
	}
}
