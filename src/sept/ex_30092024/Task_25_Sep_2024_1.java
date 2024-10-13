package sept.ex_30092024;

import java.util.Scanner;

public class Task_25_Sep_2024_1 {
    public static void main(String[] args) {
        // table of number n = 10 , print table with for or while

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int n = sc.nextInt();
        System.out.println("Multiplication for table");

        for (int i = 1; i <=10 ; i++) {
            System.out.println(n + "x" + i  + " = " +(n*i) );

        }

    }
}
