package pl.waw.sgh;

public class Liczby_pierwsze {
    public static void main(String[] args) {

        int m = 20;
        int b = 0;
        for (int i = m; i >= 0; i--) {
            b = 0;
            for (int j = (i / 2); j >= 1; j--) {
                int c = i % j;
                if (c == 0) break;
                if (j == 2) {
                    System.out.println(i);
                }
            }
        }
        if (m >= 2) {
            System.out.println(2);
        }

    }
}


