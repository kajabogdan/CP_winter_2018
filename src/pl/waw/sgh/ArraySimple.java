package pl.waw.sgh;

import java.util.Arrays;

public class ArraySimple {
    public static void main(String[] args) {

        // new when we create a new object exept for int, string etc
        //we say how many elements our array has, Integer gives us null, int gives us
        //Having Integer there makes it impossible to add anything,
        Integer[] arrInt = new Integer[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 5;

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Elem " + i + " = " + (arrInt[i] + 10));
        }
        String[] arrStr = new String[]
                {
                        "abc", "def", "efg"
                };
        //this is how we can just print the whole array as it is
        System.out.println(Arrays.toString(arrStr));
    }
}