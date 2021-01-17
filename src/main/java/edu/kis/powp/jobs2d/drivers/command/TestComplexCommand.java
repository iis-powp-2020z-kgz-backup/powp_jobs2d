package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class TestComplexCommand {
    static class Job2dDriverMock implements Job2dDriver{
        @Override
        public void setPosition(int x, int y) {
            System.out.println("Position: (" + x + ", " + y + ")");
        }

        @Override
        public void operateTo(int x, int y) {
            System.out.println("Operate to: (" + x + ", " + y + ")");
        }
    }

        public static void main(String[] args) {
        Job2dDriverMock driverMock = new Job2dDriverMock();
        SetPositionCommand setPositionCommand = new SetPositionCommand(14, 53);
        OperateToCommand operateToCommand = new OperateToCommand(543, 34);
        ComplexCommand complexCommand = new ComplexCommand();

        complexCommand.addCommand(setPositionCommand);
        complexCommand.addCommand(operateToCommand);
        complexCommand.execute(driverMock);
    }
}
