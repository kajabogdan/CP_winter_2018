package ShapesHomework;

import java.awt.*;

public class Rectangle2 extends Shapes2 {
    double parB =0;
    public Rectangle2(double parA, double parB) {
        super(parA);
        this.parB = parB;
    }
    public double calculateSurface() {
        return parA * parB;
        }
        }
