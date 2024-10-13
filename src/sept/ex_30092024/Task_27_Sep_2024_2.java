package sept.ex_30092024;

public class Task_27_Sep_2024_2 {
    public static void main(String[] args) {
        // calculate the sum of numbers from 0 to 100

        // by using while loop
//   int sum = 0;
//   int i = 1;
//   while(i <=100){
//       sum= sum+i;
//       i++;
//   }
//        System.out.println("sum of numbers from 0 to 100-->" +sum);

        // by using do while loop

        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        }while(i<=100);
        System.out.println("sum of numbers from 0 to 100-->" + sum);

        }
    }
