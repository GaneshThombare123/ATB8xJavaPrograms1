package sept.ex_30092024;

public class Lab122_functions_type {
    public static void main(String[] args) {

        //calling-- inside the main
        // -- calling type 1
        function_type1();
        // -- calling type 2
        String name = function_type2();
        System.out.println("name");
        //calling type3
        function_type3("Amit");

        //calling type4
        int result= function_type4(3, 4);
        System.out.println(result);

    }

    //type 1) without parameter and without return type
    public static void function_type1() {
        System.out.println("1.without parameter and without return type");
    }

    //type2) without parameter but with return type
    // defining
    public static String function_type2() {
        System.out.println("2.without parameter but with Return type");
        return "Pramod";
    }

    //type3) with parameter but without return type
    // defining
    public static void function_type3(String name) {
        System.out.println("3.with parameter but without return type");
        System.out.println("You have shared -->" + name);


    }
    //type4) with parameter and with return type
    // defining
    public static int function_type4(int a, int b) {
        System.out.println("4.with parameter and with return type");
        return (a+b);
    }
}