package edu.kis.powp.jobs2d.util;

import java.awt.Color;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;

public class ExtendedLineFactory extends LineFactory {
    public static ILine getCustomizableLine(Color n_color, float n_thickness, boolean n_dotted) {
		return new CustomizableLine(n_color, n_thickness, n_dotted);
	}
}
