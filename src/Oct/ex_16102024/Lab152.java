package Oct.ex_16102024;

public class Lab152 {
    public static void main(String[] args) {

      //  Book book = new Book() {  ---> object cant be created for abstract class.


        Book book = new PrintMyBook("Pramod", "PD", 123 );  //Dynamic Dispatch
        book.getDetails();

        }

    }

