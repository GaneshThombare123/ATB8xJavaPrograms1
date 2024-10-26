package Oct.ex_23102024;

public class Lab176_Exception_Handle {
    public static void main(String[] args) {


        int a = 0;
        try {
            int c = 10/a;   //by zero arithmetic exception
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());  // Arithmetic exception


        }finally {
            System.out.println("I will be always executed");
        }

    }


}
