package Oct.ex_04102024.Constructors.PC;

public class Lab126 {
    public static void main(String[] args) {
        Dog gs = new Dog("GS","Moti",1,4);
        System.out.println(gs.breed);
        System.out.println(gs.name);
        System.out.println(gs.age);
        System.out.println(gs.legs);

        Dog bd = new Dog("BD");
        System.out.println(bd.breed);
        System.out.println(bd.name);
        System.out.println(bd.age);
        System.out.println(bd.legs);


        }

}



