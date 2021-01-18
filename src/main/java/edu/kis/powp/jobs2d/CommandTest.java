package edu.kis.powp.jobs2d;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class CommandTest {

    static class Jobs2dDriverTestMock implements Job2dDriver {
        
        @Override
        public void setPosition(int x, int y) {
            System.out.println("Position set to " + x + " and " + y);
        }

        @Override
        public void operateTo(int x, int y) {
            System.out.println("Operate to " + x + " and " + y);
        }
    }

    public static void main(String[] args) {

        Jobs2dDriverTestMock mockTest = new Jobs2dDriverTestMock();

        SetPositionCommand setPositionCommand = new SetPositionCommand(9, 4);
        OperateToCommand operateToCommand = new OperateToCommand(4, 4);
        ComplexCommand compositePatternExample = new ComplexCommand();
        
        compositePatternExample.add(setPositionCommand);
        compositePatternExample.add(operateToCommand);
        compositePatternExample.execute(mockTest);

    }

}