package edu.kis.powp.jobs2d.drivers.command;

public class ShapesCommandFactory {
    public static ComplexCommand getTriangleCommand() {
		ComplexCommand algorithm = new ComplexCommand();
		algorithm.addCommand(new SetPositionCommand(  -120, -40));
		algorithm.addCommand(new OperateToCommand(       0, 120));
		algorithm.addCommand(new OperateToCommand(     120, -40));
		algorithm.addCommand(new OperateToCommand(    -120, -40));
		return algorithm;
	}
    
	public static ComplexCommand getRectangleCommand() {
		ComplexCommand algorithm = new ComplexCommand();
		algorithm.addCommand(new SetPositionCommand(  -200, -150));
		algorithm.addCommand(new OperateToCommand(    -200,  150));
		algorithm.addCommand(new OperateToCommand(     200,  150));
		algorithm.addCommand(new OperateToCommand(     200, -150));
		algorithm.addCommand(new OperateToCommand(    -200, -150));
		return algorithm;
	}
}
