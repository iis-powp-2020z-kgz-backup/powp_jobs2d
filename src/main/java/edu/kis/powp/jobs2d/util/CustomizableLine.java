package edu.kis.powp.jobs2d.util;

import java.awt.Color;
import edu.kis.legacy.drawer.shape.line.AbstractLine;

public class CustomizableLine extends AbstractLine {
    public CustomizableLine(Color n_color, float n_thickness, boolean n_dotted) {
        super();
        color = n_color;
        thickness = n_thickness;
        dotted = n_dotted;
    }
}