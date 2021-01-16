package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;

public class SetPositionCommand implements DriverCommand {
   
    private int x;
    private int y;

    DriverAdapter device;

    public SetPositionCommand(DriverAdapter device) {
        this.device = device;

    }

    @Override
    public void execute() {
        device.setPosition(x, y);
    }

}
