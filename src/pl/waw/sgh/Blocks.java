package pl.waw.sgh;

public class Blocks {
    public static void main(String[] args) {
        int i1 = 0;
        // when something is in a block it's not visible from the parent, you can't do it like this
        {
            System.out.println("inside a block i1=" + i1);
            int i2 = 5;
            System.out.println("inside a block i2=" + i2);

        }
        System.out.println("outside of block i1=" + i1);
        System.out.println("outside of block i2=" + i2);

    }


}
