package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.drivers.command.FigureCommandFactory;

public class TestFigureCommands {

    public interface CommandTemplate {
        public void invoke(Job2dDriver driver);
    }

    public static class CommandSquare implements CommandTemplate {
        public void invoke(Job2dDriver driver) {
            FigureCommandFactory.getSquareCommand(driver).execute();
        }
    }

    public static class CommandTriangle implements CommandTemplate {
        public void invoke(Job2dDriver driver) {
            FigureCommandFactory.getTriangleCommand(driver).execute();
        }
    }
}
