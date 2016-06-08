package types.demo;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.math.BigDecimal;

public class TypesDemo {
    @NotNull Integer ifield;
    @Nullable Integer field;

    public strictfp static void main(String[] args) {
        //8 primitive types
        byte b = 0; //0..255 or -128..127
        short s = 0;
        int i = 0; //
        long l = 0;

//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);

        byte counter = 0;
        for (int ii = 0; ii < 128; ii++) {
            counter++;
        }
//        System.out.println(counter);

        byte bb = 0;
        short ss = 3000;
        bb = (byte) ss; //casting
        ss = bb; //auto casting
//        System.out.println(bb);

        float f = -3e-3f;//.0F;
        double d = .0;
//        System.out.println(Double.MIN_VALUE);
//        System.out.println(Double.MAX_VALUE);

//        System.out.println(1.f/3);
        BigDecimal bd; //for rescue

        char ch = 'e';
        int sss = ch;
//        System.out.println((int)'r');
//        System.out.println((char)20_000);

        boolean bbb = true | false;

//        System.out.println(0/0.);
//        System.out.println(Float.NaN);

        bb = 0;
        m(bb);
//        System.out.println(bb);

        Integer iw = null; //new Integer(4);
//        System.out.println(iw.toString());


        String str = "a";
        str = str.toUpperCase();
//        System.out.println(str);

        String str1 = "A";
        String str2 = "A"; //intern
//        System.out.println(str1.equals(str2));

        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1 == i2);
    }

    private static void m(byte arg) {
        arg++;
    }
}
