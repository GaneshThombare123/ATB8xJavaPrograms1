package Nov.ex_04112024_Generics;

public class Lab216_Generics {
    public static void main(String[] args) {
        // Generics - available for all

        temp(12);
        temp("Pramod");
        temp(true);

        //T - is ref it can be anything

    }
   public static <T>void temp (T a){
        System.out.println(a);
    }
}
