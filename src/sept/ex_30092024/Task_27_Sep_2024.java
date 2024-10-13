package sept.ex_30092024;

public class Task_27_Sep_2024 {
    public static void main(String[] args) {

//     int count = 0;
//     int Number = 2;
//
//     do {
//         System.out.println(Number);
//         Number += 2;
//         count++;
//     }while (count < 5);

        int count = 0;
        int number = 2;
        while (count < 5) {
            if (number%2 == 0) {
                System.out.println(number);
                count++;

            }
            number++;
        }
    }
}



