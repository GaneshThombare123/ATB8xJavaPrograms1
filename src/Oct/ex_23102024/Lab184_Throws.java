package Oct.ex_23102024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab184_Throws {

    public static void main(String[] args) throws FileNotFoundException {

        extracted();

    }

    private static void extracted() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("dasda.txt");
    }
}
