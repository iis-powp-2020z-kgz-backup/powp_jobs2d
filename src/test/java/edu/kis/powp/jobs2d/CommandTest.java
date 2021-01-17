package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class CommandTest {

    static class Jobs2dDriverMock implements Job2dDriver {
        @Override
        public void setPosition(int x, int y) {
            System.out.println("Set Position to " + x + " " + y);
        }

        @Override
        public void operateTo(int x, int y) {
            System.out.println("Operate to " + x + " " + y);
        }
    }

    public static void main(String[] args) {

        Jobs2dDriverMock mock = new Jobs2dDriverMock();

        SetPositionCommand setCommand = new SetPositionCommand(8, 6);
        OperateToCommand operateCommand = new OperateToCommand(5, 1);

        ComplexCommand composite = new ComplexCommand();
        composite.add(setCommand);
        composite.add(operateCommand);
        composite.execute(mock);

    }

}
