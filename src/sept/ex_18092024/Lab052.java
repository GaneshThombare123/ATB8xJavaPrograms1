package sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args){

        // GST 18.45

        int course = 100;
        float GST = 18.45f;
        //int total = course + GST; // Narrowing invalid implicit
        //float total = course + GST; // Narrowing invalid implicit
        int total = course + (int)GST; // Narrowing valid Explicit-- with loss
        //int total1 = course + (folat)GST;
        System.out.println(total);

    }
}
