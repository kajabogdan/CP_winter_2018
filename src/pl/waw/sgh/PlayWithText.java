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

        //
        System.out.println(s3.substring(2));
        System.out.println(s3.substring(1, 4));

        System.out.println(s1len);


    }
}

