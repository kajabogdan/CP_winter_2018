package pl.waw.sgh;

import java.util.Scanner;

public class InputParamScanner {
    public static void main(String[] args) {
        System.out.println(" This is output");
        System.err.println(" This is error");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide your name ");
        // this one never breaks
        while (scanner.hasNext()) {
            String name = scanner.next();
            if (name.equals("exit")) break;
            System.out.println("Hello" + name);
        }
        // this doesn't accept something that is not an int
        while (scanner.hasNextInt()) {
            Integer myInt = scanner.nextInt();
            if (myInt.equals(0)) break;
            System.out.println("I got " + myInt);

        }
    }
}
