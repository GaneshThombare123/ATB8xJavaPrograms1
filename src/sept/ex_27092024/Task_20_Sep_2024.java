package sept.ex_27092024;

import java.util.Scanner;

public class Task_20_Sep_2024 {
    public static void main(String[] args) {
        // FizzBuzz Problem
        // write a program that print number from o to n (100)
        // for Multiples of 3 , print "Fizz" instead of numbers
        // for Multiples of 5 , print "Buzz" instead of numbers
        // for numbers multiples of both 3 and 5 print "FizzBuzz"


        // logic building
        //step -1
        //input --> n(100)--> using scanner class
        // output-->  String --> Fizz, Buzz, FizzBuzz.


        // step -2
        // Rough logic
        //  for --> int i = 1 to i < 100 (n)
        // i = multiples ? modulas- i % 3 ==0; -- Fizz
        // i = multiples ? modulas- i % 5 ==0; -- Buzz
        // i = multiples ? modulas- i % 3 ==0  && i % 5 ==0; -- FizzBuzz

        // Step -3
        // Real logic


        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number n = 100");
        int n = sc.nextInt();

        for (int i = 1; i <= 100; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
                
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
                
            }
              else{
                System.out.println(i);
            }
        }


    }
}
