package sept.ex_23092024;

public class Lab089 {
    public static void main(String[] args) {
        char c = 'B';
        switch (c) {
            default:
                System.out.println("Out of the box");
                break;
            //case 65:
            //    System.out.println("65");
            //   break;
            case 'A'+1:
                System.out.println("A+1");
                break;
        }
    }
}