package pl.waw.sgh;

public class PlayWithText {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;
        System.out.println(s3);

        int s1len = s1.length();
        //wyswietla pozycje tych liter (liczac od 0):
        System.out.println(s1.indexOf("ab"));
        //Wyswietla dany znak w stringu liczac od 0:
        System.out.println(s1.charAt(2));

        //ucina po 2 literce, liczac od 0
        System.out.println(s3.substring(2));
        System.out.println(s3.substring(1, 4));

        System.out.println(s1len);

        String s4 = "ABC";
        //String s5 = "ABC"
        String s5 = new String("ABC");
        System.out.println(s4);
        System.out.println(s5);

        /*if (s4== s5) {
            System.out.println("s4 and s5 are equal");
        } else {
            System.out.println("s4 and s5 are not equal");
            // nie rowna sie to samo, bo to rozne obiekty, a literek nie porownuje */

        if (s4.equals(s5)) {
            System.out.println("s4 and s5 are equal by content");
        } else {
            System.out.println("s4 and s5 are not equal by content");
        }
    }
}

