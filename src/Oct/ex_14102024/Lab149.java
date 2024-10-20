package Oct.ex_14102024;

public class Lab149 {
    public static void main(String[] args) {

    }
    interface I3{
        default void start (){
            System.out.println("Body! DM");
        }
        void stop();
        void car();

        static void ss(){
            System.out.println("Static can have body in interface");

        }
    }
abstract class AA{
        void f1 (){
            System.out.println("Concrete method");
        }

        abstract void f2();

        static void f4(){
            System.out.println("In abstract class static is possible, yes");
        }
}
}


