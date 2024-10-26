package Oct.ex_23102024;

public class Lab177_MultCatch {
    public static void main(String[] args) {

        try {
            String ip = args[0];  // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100/a;  //Arithmetic exception
               System.out.println(b);
        }      catch (NumberFormatException e) {
               System.out.println(e.getMessage());

        }       catch (ArithmeticException e){
                System.out.println(e.getMessage());

            } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println(e.getMessage());

        } finally {
            System.out.println("I Will be always executed");

        }



    }
}
