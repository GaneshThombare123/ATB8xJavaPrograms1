package Oct.ex_21102024_Wrapper_Exception;

public class Lab167 {
    public static void main(String[] args) {
        //primitive value to wrapper

        int a = 10; // primitive vale
        Integer b = a; // wrapping the int a (Boxing)
        System.out.println(b); // orignal vaue = 10
        System.out.println(Integer.MAX_VALUE); //Static varaible in the class , without object we are using
        System.out.println(Integer.MIN_VALUE); //Static varaible in the class , without object we are using

        Integer a2 = 42;
        int value = a2; // unboxing - Integer -> int
        System.out.println(value);



    }
}
