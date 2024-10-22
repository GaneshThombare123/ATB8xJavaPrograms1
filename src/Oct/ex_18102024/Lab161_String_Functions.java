package Oct.ex_18102024;

public class Lab161_String_Functions {
    public static void main(String[] args) {
        String str = " Hello World ";
        String name = " H e l l o W o r l d ";
        // Length of the String

        System.out.println("length: "+ str.length()); // output = 13

        String str1 = "Pramod";
        // Length of the String -- start count from 1

        System.out.println("length: "+ str1.length()); // output = 6

        //substring--  start count from 0
        String str3 = " Hello World ";
        System.out.println("Substring: " +str3.substring(1, 5));

        // Trim -- will remove spaces start and stop
        String str4 = " Hello World ";
        System.out.println("Trimmed: '" + str4.trim() + "'");

        // to convert upper and lower case
        String str5 = " Hello World ";
        System.out.println("UPPERCASE: " +str5.toUpperCase());
        System.out.println("lowercase: " +str5.toLowerCase());

        //found chara from given posistion--by using (charAt)
        System.out.println(str4.charAt(1));

        //---

        System.out.println(str.equals("Hello")); // false
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("l")); // means present of not for given string-- so true
        System.out.println(str.contains("p")); // means present of not for given string-- so false
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println(str.split( " "));
        System.out.println(str.repeat( 5));
        System.out.println(name.strip());// remove white space
        System.out.println(str.compareTo(str3));// if both are same then it will returns zero(0)
    }
}
