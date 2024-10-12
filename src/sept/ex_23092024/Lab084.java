package sept.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode) {
            case 001, 002, 005:
                System.out.println("All of them are electronic gadget ");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
