package sept.ex_18092024;

import java.sql.SQLOutput;

public class Lab050 {
    public static void main(String[]args){

        // Type Casting
        // widening -- implicit, Explicit, lossless
        // Narrowing-- implicit, Explicit(with data type), loss

        //----widening----

        byte b = 10;
        int a = b; // Implicit type casting - JVM
        int a1 = (int)b; // Explicit type casting - JVM

           //-- Narrowing--

        int val = 200;
       // byte b1 = val; invalid Implicit casting
       byte b2 = (byte)val; //Explicit casting
        System.out.println(b2);

    }
}
