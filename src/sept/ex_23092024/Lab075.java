package sept.ex_23092024;

public class Lab075 {
    public static void main(String[] args) {
        //Switch condition
// Day - 1 to 7 --> 1 mon, 2 tue, 3 wen....7 sun

        int day = 1;
        switch (day){
            default:
                System.out.println("No idea about this day!!");
                break;
            case 1:
            System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wen");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        }
        System.out.println("End of the Loop");
    }
}
