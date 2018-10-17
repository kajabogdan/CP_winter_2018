package pl.waw.sgh;

public class DataTypes {

    public static void main(String[] args) {
        /* psvm */
       /* byte b1= 15;
        byte b2= 120;
        int i1= 1434535377;
        int i2= 985242687;
        int i3=i1+i2;
        tu nie dziala */

        int i1 = 1434535377;
        int i2 = 985242687;
        long i3 = i1;
        i3 += 12;

        System.out.println(i3);
        /*sout*/

        int a = 5;
        int b, bb;
        b = a++;
        a = 5;
        bb = ++a;

        System.out.println("b= " + b);
        System.out.println("bb= " + bb);
        /* tak naprawde, ++ d
        odalo sie w b i bb, ale dopiero pozniej i zostalo wykonane w bb */

        double d1 = 2;
        double d2 = 3;

        double d3 = Math.pow(d1, d2);

        System.out.println("d3= " + d3);

        int ii1, ii2;
        ii1 = 5;
        ii2 = 5;
       /* if (ii1==ii2 ){
            System.out.println("ii2=ii1");            }
            else {
            System.out.println("not equal"); */

        boolean cond = ii1 == ii2;
        //! - negate
        //|| - or
        //&& - and

        if (cond || (ii2 > 3 && ii1 > 5)) {
            System.out.println("ii2=ii1");
        } else {
            System.out.println("not equal");

            int iii = (ii1 > 5 ? 15 : 10);
            // znaczy to samo co:
            if (ii1 > 5)
                iii = 15;
            else iii = 10;

        }

    }
}
