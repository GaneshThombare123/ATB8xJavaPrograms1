package sept.ex_23092024;

public class Lab085 {
    public static void main(String[] args) {
        int iteamcode = 003;
        switch (iteamcode){
            case 001 ->System.out.println("it is a laptop!!");
            case 002 ->System.out.println("it is a TV!!");
            case 003, 004 ->System.out.println("it is a redio!!");
                default ->System.out.println("None");
        }

    }
}
