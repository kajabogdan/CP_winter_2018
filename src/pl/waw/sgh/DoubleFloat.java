package pl.waw.sgh;

import java.text.NumberFormat;

public class DoubleFloat {

    public static void main(String[] args) {

        Double d1 = 3423535d;
        // float can be a doubble  but doubble can not be a float - different precision

        double d2 = 34235;
        float f1 = 456789;
        //d2=f1; - mozemy
        float f2 = d1.floatValue();
        d1.intValue();
        // converts primitative to object type
        Double d3 = Double.valueOf(d2);
        System.out.println(d1 * d2);


    }
}
