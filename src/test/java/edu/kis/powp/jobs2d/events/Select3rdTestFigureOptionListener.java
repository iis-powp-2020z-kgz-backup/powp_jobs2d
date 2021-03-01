package edu.kis.powp.jobs2d.events;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Select3rdTestFigureOptionListener implements ActionListener {
	private final DriverManager driverManager;

	public Select3rdTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Job2dDriver currentDriver = driverManager.getCurrentDriver();

		ShapesCommandFactory.getRectangleCommand().execute(currentDriver);
	}
}
