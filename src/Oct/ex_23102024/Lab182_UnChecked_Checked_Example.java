package Oct.ex_23102024;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab182_UnChecked_Checked_Example {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("UnChecked!!");
        }
        try {
            FileReader f = new FileReader("C://abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Checked Exception!!");
        }

    }
}
