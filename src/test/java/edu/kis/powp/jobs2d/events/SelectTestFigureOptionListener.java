package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.commands.FigureFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private int option;

	public SelectTestFigureOptionListener(DriverManager driverManager, int option) {
		this.driverManager = driverManager;
		this.option = option;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (option){
			case 0:
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case 1:
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case 2:
				FigureFactory.getDiamod(driverManager.getCurrentDriver()).execute();
				break;
			case 3:
				FigureFactory.getTrapeze(driverManager.getCurrentDriver()).execute();
				break;
			case 4:
				FigureFactory.getPizza(driverManager.getCurrentDriver()).execute();
				break;
		}

	}
}
