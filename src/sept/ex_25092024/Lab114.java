package sept.ex_25092024;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Lab114 {
    public static void main(String[] args) {
        // how to take user input
        Scanner sc = new Scanner(System.in);     //create new object
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("\n");

        System.out.println("Enter the Sting  ");
        String name = sc.next();
        System.out.println(name);

    }
}
