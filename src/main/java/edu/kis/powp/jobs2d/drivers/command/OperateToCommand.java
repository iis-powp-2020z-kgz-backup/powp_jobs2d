package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;

public class OperateToCommand implements DriverCommand {

    private int x;
    private int y;

    DriverAdapter device;

    public OperateToCommand(DriverAdapter device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.operateTo(x, y);

    }

}
