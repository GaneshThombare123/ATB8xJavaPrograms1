package Oct.ex_21102024_Wrapper_Exception;

public class Lab168 {
    public static void main(String[] args) {
        String num = "10";
      //  int a = num; --> non primitive data type to primitive data type not possible
        Integer a = Integer.valueOf(num);// by using Integer can convert no primitive to primitive data type.
        System.out.println(a);

        int a2 = a; // Unboxing

        // Sting to primitive
        int a3= Integer.parseInt(num);



    }
}
