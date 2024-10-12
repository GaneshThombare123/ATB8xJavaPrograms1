package sept.ex_23092024;

public class Lab079 {
    public static void main(String[]args) {

        // web automation
        // i will ask which browser you want me run the code
        //chrome-- execute the chrome
        //firefox --execute the firefox
// edge-- edge case
        String browser = "chrome";
        switch (browser) {
            default:
                System.out.println("I have no idea which browser is this!!");
                break;
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;


        }

    }
}
