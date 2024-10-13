package sept.ex_30092024;

public class Lab121 {
    public static void main(String[] args) {
        //1) Pre-defined(built) function
// calling function--> inside the main is valid
        greet();
        greet();
        greet();
        greet();
        greet();
        greet(); // user can call multiple times.
    }

    //calling function--> out of main is not valid
    //         greet();  //calling function--> out of main is not valid

    // Define a function
    public static void greet(){
        System.out.println("Hi..!!");
    }

    }



