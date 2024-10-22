package Oct.ex_18102024;

public class Lab160_String_Equals {
    public static void main(String[] args) {
        String s1 = "Hello"; // string literal
        String s4 = "Hello"; // string literal
        String s2 = new String("Hello"); // object area
        String s3 = new String("Hello"); // object area
        String s5 = new String("hello"); // object area

//        System.out.println(s1 == s2);// location of s1 and s2 are totally different so it is a 'false'.
//        System.out.println(s3 == s2);// location of s1 and s2 are totally different so it is a 'false'.
//        System.out.println(s1 == s4);// true, here == basically checking the ref values in case of int.
         // here == basically checking the ref location in case of string
        // here == basically checking the ref values in case of int.

//-----------------------
        // how can i check values ? equals == value

        System.out.println(s1.equals(s2)); // here checking values means- 'Hello' and 'Hello' - true
        System.out.println(s2.equals(s3)); // here checking values means- 'Hello' and 'Hello'- true
        System.out.println(s3.equals(s4)); // here checking values means- 'Hello' and 'Hello'- true
        System.out.println(s3.equals(s5)); // here checking values means- 'Hello' and 'hello'- false
        System.out.println(s3.equalsIgnoreCase(s5)); //ignore the false case.-- so true
     }
}


