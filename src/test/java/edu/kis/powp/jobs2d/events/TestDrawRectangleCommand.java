package edu.kis.powp.jobs2d.events;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.FigureFactory;

public class TestDrawRectangleCommand implements ActionListener{
    
    private DriverManager driverManager;

	public TestDrawRectangleCommand(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        FigureFactory.drawRectangle().execute(driverManager.getCurrentDriver());
	}
}
