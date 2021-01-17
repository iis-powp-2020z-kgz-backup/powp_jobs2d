package edu.kis.powp.jobs2d.drivers.command;

public class FigureFactory {
    
    public static ComplexCommand drawSquare(){

        ComplexCommand steps = new ComplexCommand();
        steps.add(new SetPositionCommand(20,20));
        steps.add(new OperateToCommand(40,20));
        steps.add(new OperateToCommand(40,40));
        steps.add(new OperateToCommand(20,40));
        steps.add(new OperateToCommand(20,20));
        return steps;
    }



public static ComplexCommand drawRectangle(){
        ComplexCommand steps = new ComplexCommand();
        steps.add(new SetPositionCommand(45,45));
        steps.add(new OperateToCommand(0,45));
        steps.add(new OperateToCommand(0,-40));
        steps.add(new OperateToCommand(45,-40));
        steps.add(new OperateToCommand(45,45));
        return steps;

}
public static ComplexCommand drawTriangle(){
        ComplexCommand steps = new ComplexCommand();
        steps.add(new SetPositionCommand(90,90));
        steps.add(new OperateToCommand(90,35));
        steps.add(new OperateToCommand(40,35));
        steps.add(new OperateToCommand(90,90));
        return steps;

}
}
