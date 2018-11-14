package pl.waw.sgh;

import java.util.Properties;

public class FileOper {
    public static void main(String[] args) {
        //Prints out where it runs the programme
        //getenv checks the environment
        String tmp = System.getenv("TMP");
        System.out.println(tmp);

        // Properties props = System.getProperties();
        tmp = System.getProperty("java.io.tmpdir");
        System.out.println(tmp);

        tmp = System.getProperty("os.name");
        System.out.println(tmp);

        tmp = System.getProperty("user.home");
        System.out.println(tmp);

        String myProp = System.getProperty("myProp", "defaultValue");
        System.out.println("myProp: " + myProp);

    }
}
