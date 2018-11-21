package pl.waw.sgh.Objects;

public class PlayWithRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setParams(4, 5);
        r1.setParB(30);
        System.out.println("R1 surface: " + r1.calculateSurface());
        System.out.println("R1 " + r1.toString());
        Rectangle r2 = new Rectangle();
        r2.setParams(1, 6);
        System.out.println("R2 surface: " + r2.calculateSurface());
        System.out.println("R2 " + r2.toString());

        System.out.println("R3 " + new Rectangle(7, 8).toString());
    }
}
