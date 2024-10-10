package sept.ex_20092024;

public class Lab075 {
    public static void main(String[] args) {
        // grade calculator
        // A --> 90-100
        //B --> 80-89
        //C --> 70-79
        // D --> 60-69
        // F --> 0-59

        char grade = 'F';
        //int score = 89;
        int score = 100;
        if (score >= 90 && score <= 100){
            grade = 'A';
        }else if (score >= 80 && score <= 89){
          grade = 'B';
        }else if (score >= 70 && score <= 79) {
            grade = 'C';
        }else if (score >= 60 && score <= 69) {
            grade = 'D';
        }else if (score <= 0 || score > 100) {
            System.out.println("LOL !!, are you God?");
            grade = 'O';
        }else {
            grade = 'F';
        }
        System.out.println("Your garde is --> " + grade);
    }
}
