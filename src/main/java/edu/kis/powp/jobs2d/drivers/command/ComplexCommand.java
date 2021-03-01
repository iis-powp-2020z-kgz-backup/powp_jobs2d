package edu.kis.powp.jobs2d.drivers.command;
import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.List;
import java.util.ArrayList;


public class ComplexCommand implements DriverCommand {
	private final List<DriverCommand> driverCommandList = new ArrayList<>();

	@Override
	public void execute(Job2dDriver job2dDriver) {
		driverCommandList.forEach(command -> { command.execute(job2dDriver); });
	}

	public void addCommand(DriverCommand command) {
    	driverCommandList.add(command);
	} 
}
