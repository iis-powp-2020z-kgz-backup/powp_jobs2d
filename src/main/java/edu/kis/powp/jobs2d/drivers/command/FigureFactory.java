package edu.kis.powp.jobs2d.drivers.command;

public class FigureFactory {

    public static ComplexCommand drawTriangle() {

    ComplexCommand listOfPoints = new ComplexCommand();
    
    listOfPoints.add(new SetPositionCommand(90, 90)); //first point
    listOfPoints.add(new OperateToCommand(90, 35));
    listOfPoints.add(new OperateToCommand(40, 35));
    listOfPoints.add(new OperateToCommand(90, 90)); //back to the first point
    
    return listOfPoints;

    }

    public static ComplexCommand drawSquare() {

        ComplexCommand listOfPoints = new ComplexCommand();
        
        listOfPoints.add(new SetPositionCommand(20, 20)); //first point
        listOfPoints.add(new OperateToCommand(40, 20));
        listOfPoints.add(new OperateToCommand(40, 40));
        listOfPoints.add(new OperateToCommand(20, 40));
        listOfPoints.add(new OperateToCommand(20, 20)); //back to the first point
        
        return listOfPoints;

    }



    public static ComplexCommand drawRectangle() {
        
        ComplexCommand listOfPoints = new ComplexCommand();
        
        listOfPoints.add(new SetPositionCommand(45, 45)); //first point
        listOfPoints.add(new OperateToCommand(0, 45));
        listOfPoints.add(new OperateToCommand(0, -40));
        listOfPoints.add(new OperateToCommand(45, -40));
        listOfPoints.add(new OperateToCommand(45, 45)); //back to the first point
        
        return listOfPoints;

    }

}