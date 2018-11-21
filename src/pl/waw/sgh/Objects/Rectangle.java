package pl.waw.sgh.Objects;

public class Rectangle extends Shapes {

    private double parA = 0;
    private double parB = 0;

    //misspeling makes it a method, constructor has to have the same name as class
    public Rectangle() {
    }

    //now we can't use Rectangle() without the parameters
    public Rectangle(double parA, double parB) {
        setParams(parA, parB);
    }

    //we can use the same name, just need to refer to the main ones as this.
    void setParams(double paraA, double paraB) {
        this.parA = parA;
        this.parB = paraB;
    }

    public double calculateSurface() {
        return parA * parB;
    }

    public void setParB(double a) {
        parB = a;
    }

    //polymorphis
    public String toString() {
        return getClass().getSimpleName() + "[" + parA + parB + "], surf:" + calculateSurface();
    }
}