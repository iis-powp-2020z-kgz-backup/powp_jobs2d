package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;

/**
 * driver adapter to drawer: SpecialLine
 */
public class LineDrawerAdapter implements Job2dDriver {
	
	private int startX = 0, startY = 0;
	private DrawPanelController drawPanelController;
	
	public LineDrawerAdapter(DrawPanelController argDrawPanelController) {
		super();
		drawPanelController = argDrawPanelController;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getSpecialLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);

		drawPanelController.drawLine(line);
		setPosition(x, y);
	}

	@Override
	public String toString() {
		return "SpecialLine! @Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
