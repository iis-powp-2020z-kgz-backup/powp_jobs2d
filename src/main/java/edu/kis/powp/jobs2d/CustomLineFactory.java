package edu.kis.powp.jobs2d;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

import java.awt.*;

public class CustomLineFactory{
    public static ILine getCustomLine(Color color, float thickness, boolean dotted){
        return new CustomLine(color,thickness, dotted);
    }
}
