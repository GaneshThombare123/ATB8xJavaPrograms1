package Oct.ex_21102024_Wrapper_Exception;

public class lab174 {
    public static void main(String[] args) {

//        System.out.println("Start the program");
        int c = 0;
      try {
          c = 10 / c;

          String s1 = null;
          s1.trim();
          System.out.println(c);
      }
      // multiple try/cath is allowing, combined catch also allowed
      catch (ArithmeticException | NullPointerException e){
          System.out.println(e);
      } catch (Exception e){
          System.out.println(e.getMessage());
      }
        System.out.println("End of the program");


//
//        // unchecked exception
//        System.out.println("Start the Program");
//        String s1 = null; // null pointer exception
//        System.out.println(s1.trim());
//        System.out.println("End the Program");
    }
}
