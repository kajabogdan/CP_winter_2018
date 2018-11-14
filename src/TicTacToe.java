import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("H://TicTacToe.csv");
        Scanner scanner = new Scanner(inFile);
        int k = 0;
        int one = 0;
        int two = 0;
        int verticalone = 0;
        int verticalone2 = 0;
        int verticalone3 = 0;
        int verticaltwo = 0;
        int verticaltwo2 = 0;
        int verticaltwo3 = 0;
        int ukosone = 0;
        int ukosone2 = 0;
        int ukostwo = 0;
        int ukostwo2 = 0;
        int b = 0;
        int c = 2;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            //This helps me save parts as different elements of an array
            String[] elems = line.split(",");
            for (int i = 0; i <= 2; i++) {
                System.out.print(elems[i] + " ");
                if ((Boolean) elems[i].contains("0")) {
                    k++;
                }
            }
            if (elems[0].equals("1")) {
                verticalone++;
            }
            if (elems[1].equals("1")) {
                verticalone2++;
            }
            if (elems[2].equals("1")) {
                verticalone3++;
            }
            if (elems[0].equals("2")) {
                verticaltwo++;
            }
            if (elems[1].equals("2")) {
                verticaltwo2++;
            }
            if (elems[2].equals("2")) {
                verticaltwo3++;
            }
            if (elems[b].equals("1")) {
                ukosone++;
            }
            if (elems[b].equals("2")) {
                ukostwo++;
            }
            if (elems[c].equals("1")) {
                ukosone2++;
            }
            if (elems[c].equals("2")) {
                ukostwo2++;
            }
            b++;
            c--;
            System.out.println(" ");
            if (line.contains("1,1,1") || verticalone == 3 || verticalone2 == 3 || verticalone3 == 3 || ukosone == 3 || ukosone2 == 3) {
                one++;
            }
            if (line.contains("2,2,2") || verticaltwo == 3 || verticaltwo2 == 3 || verticaltwo3 == 3 || ukostwo == 3 || ukostwo2 == 3) {
                two++;
            }
        }
        if (one != 0 && two == 0) {
            System.out.println("1 won");
        }
        if (two != 0 && one == 0) {
            System.out.println("2 won");
        }
        if (two != 0 && one != 0) {
            System.out.println("It's a tie");
        }
        if (two != 0 || one != 0) {
            System.out.println("Game is finished");
        }
        if (k != 0 && two == 0 && one == 0) {
            System.out.println("Game not finished");
        }
        if (k == 0 && two == 0 && one == 0) {
            System.out.println("Game is finished, no one won");
        }
    }
}
