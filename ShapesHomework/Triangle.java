package ShapesHomework;

import ShapesHomework.Shapes2;

public class Triangle extends Shapes2 {
    public Triangle(double parA) {
        super(parA);
    }
    public double calculateSurface() {
        return (parA * parA) /2 ;
    }
}
