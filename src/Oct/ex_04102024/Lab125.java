package Oct.ex_04102024;

public class Lab125 {
    public static void main(String[] args) {
   AHuman amit = new AHuman();
   AHuman pramod = new AHuman("parmod");
   AHuman vijay = new AHuman("vijay");
        System.out.println(amit.name);
        System.out.println(pramod.name);

//        amit.name= "Amit";
//        pramod.name= "pramod";

        System.out.println(amit.planet);
        System.out.println(pramod.planet);
        System.out.println(vijay.planet);


   //new AHuman();


    }
}
