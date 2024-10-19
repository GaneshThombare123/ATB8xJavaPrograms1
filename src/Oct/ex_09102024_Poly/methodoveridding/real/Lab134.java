package Oct.ex_09102024_Poly.methodoveridding.real;

public class Lab134 {
    public static void main(String[] args) {
        Pramod p = new Pramod();
        p.home();  // 3 BHK because overidde

        Father f = new Father();
        f.home();
        // dynamic dispatch
     Father object = new Pramod();
     object.home();

    // Pramod object = new Father();

        }
    }

