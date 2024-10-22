package Oct.ex_18102024;

public class Lab162_String_Immutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s3 = "Hello";
        String s2 = s1.concat(" World");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1); // output Hello
    }
}
