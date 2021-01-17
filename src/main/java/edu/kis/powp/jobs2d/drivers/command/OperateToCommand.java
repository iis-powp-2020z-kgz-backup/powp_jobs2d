package edu.kis.powp.jobs2d.drivers.command;
import  edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter2dSimulator;

class OperateToCommand implements DriverCommand
{
    private int x;
    private int y;

    DriverAdapter2dSimulator DriverAdapter;

    public OperateToCommand (DriverAdapter2dSimulator DriverAdapter)
    {
        this.DriverAdapter = DriverAdapter;
    }

    @Override
    public void execute() 
    { 
        DriverAdapter.operateTo(x, y);
    } 

}