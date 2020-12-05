package edu.kis.powp.jobs2d;

import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class TestFigureScripts {

    public interface FigureTemplate {
        public void invoke(Job2dDriver driver);
    }

    public static class FigureJoe1 implements FigureTemplate {
        public void invoke(Job2dDriver driver) {
            FiguresJoe.figureScript1(driver);
        }
    }

    public static class FigureJoe2 implements FigureTemplate {
        public void invoke(Job2dDriver driver) {
            FiguresJoe.figureScript2(driver);
        }
    }  
}
