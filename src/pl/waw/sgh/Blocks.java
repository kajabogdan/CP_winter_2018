package pl.waw.sgh;

public class Blocks {
    //visible everywhere
    public static int i0 = 5;
    //for static variables behaves like public but only when it's in the same package! package = pl.waw.sgh
    protected static int i3 = 5;
    //private is only visible within one class
    private int i4 = 5;

    //Mozna drukowac, ale nie mozna edytowac
    static final String MY_CONSTANT = " some text";

    public static void main(String[] args) {
        System.out.println(MY_CONSTANT);
        int i1 = 0;
        // when something is in a block it's not visible from the parent, you can't do it like this
        {
            System.out.println("inside a block i1=" + i1);
            int i2 = 5;
            System.out.println("inside a block i2=" + i2);

        }
        System.out.println("outside of block i1=" + i1);
        // also not available in another block


    }

    }

