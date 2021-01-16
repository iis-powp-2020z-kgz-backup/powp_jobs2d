package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.commands.*;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SelectFigureListener implements ActionListener {

    private DriverManager driverManager;
    private FigureFactory figureFactory = new FigureFactory();
    private int figureNumber;

    public SelectFigureListener(DriverManager driverManager, int figureNumber) {
        this.driverManager = driverManager;
        this.figureNumber = figureNumber;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver job2dDriver = driverManager.getCurrentDriver();
        new ComplexCommand(figureFactory.figureCommands(figureNumber, job2dDriver), job2dDriver).execute();
    }
}

