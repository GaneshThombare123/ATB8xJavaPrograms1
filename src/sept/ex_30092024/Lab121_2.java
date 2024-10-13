package sept.ex_30092024;

public class Lab121_2 {
    public static void main(String[] args) {
        //1) Pre-defined(built) function
// calling function--> inside the main is valid

         for (int i = 0; i < 100; i++) {
           greet();  // user can call multiple times.- here called 100 times.
         // user can call multiple times.
    }
    }

    //calling function--> out of main is not valid
    //         greet();  //calling function--> out of main is not valid

    // Define a function
    // no return type and no argument
    // tyep 1) without parameter without returen type (Parameters==Arguments)
    public static void greet(){
        System.out.println("Hi..!!");
    }

}



