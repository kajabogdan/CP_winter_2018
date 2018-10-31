package pl.waw.sgh;

public class Loops_java {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i);
        }
        // adding enter
        System.out.println();
        for (int i = 6; i > 1; i--) {
            //skips i=5
            if (i == 5) continue;
            System.out.println("i=" + i);
            // stops when i= 4
            if (i == 4) break;

        }
        // do when always operates at least once
        int j = 0;
        while (j < 6) {
            System.out.println("J= " + j);
            j++;
        }
        ;
        int k = 6;
        do {
            System.out.println("K=" + k);
            k--;
        }
        while (k > 2);

    }
}