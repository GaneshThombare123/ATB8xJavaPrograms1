package Oct.ex_21102024_Wrapper_Exception;

import java.io.FileInputStream;

public class Lab171_Exceptions {
    public static void main(String[] args) {

        // checked exceptions-when jvm knows about it
      //  FileInputStream file = new FileInputStream("C://a.txt");
        //jvm knows this file may not exist


        // unchecked exceptions
        int a = 10;
        int c = a/0;
        System.out.println(c);// run time error through

    }
}
