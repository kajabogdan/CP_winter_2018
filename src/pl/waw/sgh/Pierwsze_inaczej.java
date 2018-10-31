package pl.waw.sgh;

public class Pierwsze_inaczej {


    public static void main(String[] args) {

        int m = 20;
        int b = 0;
        int x = 0;
        if (m >= 2) {
            System.out.println(2);
        }
        for (int i = 2; i > 0; i++) {
            b = 0;
            for (int j = i - 1; j >= 1; j--) {
                int c = i % j;
                b = b + c;
                if (c == 0) break;
                if (j == 2) {
                    x++;
                    if (x > m) break;
                    System.out.println(i);
                }
            }
        }

    }
}

