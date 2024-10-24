package Oct.ex_21102024_Wrapper_Exception;

public class Lab170_Exception {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        String ip = args[0]; // 10 value will be store here
        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(b);
        System.out.println("End of the Program");


    }

}
