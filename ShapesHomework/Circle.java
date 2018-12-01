package ShapesHomework;

import java.awt.*;

public class Circle extends Shapes2 {
    public Circle(double parA) {
        super(parA);
    }
    public double calculateSurface() {
        return parA * parA *3.14;
    }
}
