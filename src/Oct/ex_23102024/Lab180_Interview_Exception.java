package Oct.ex_23102024;

public class Lab180_Interview_Exception {
    public static void main(String[] args) {
        System.out.println("Staring of the program");
        try{
            String s1 = "Pramod";
            String a1 = args[0]; // Index 0 out of bounds for length 0
            int a = 10 / 0;  /// by zero
            s1 = null; // is null
            System.out.println(s1.trim());
        }catch (Exception e){
            System.out.println("This is some problem with the program");
            System.out.println(e.getMessage());
        }
        System.out.println("End of the program");
    }

}
