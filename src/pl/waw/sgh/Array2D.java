package pl.waw.sgh;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr2d = new int[5][5];
        arr2d[0][0] = 1;
        arr2d[1][1] = 2;
        arr2d[2][0] = 9;
        arr2d[3][2] = 5;
        arr2d[4][3] = 6;
        arr2d[2][3] = 7;
        arr2d[4][4] = 7;
        //this would be row 0 array
        //arr2d [0]
        int k = 0;
        for (int i = 0; i < arr2d.length; i++) {
            int s = 0;
            System.out.print(" ");
            for (int j = 0; j < arr2d.length; j++) {
                s = s + arr2d[i][j];
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println("| " + s);
            k = k + s;
        }
        System.out.println("-----------" + " " + k);
        for (int j = 0; j < arr2d.length; j++) {
            int s = 0;
            for (int i = 0; i < arr2d.length; i++) {
                s = s + arr2d[i][j];
            }
            System.out.print(s + " ");
        }
    }
}