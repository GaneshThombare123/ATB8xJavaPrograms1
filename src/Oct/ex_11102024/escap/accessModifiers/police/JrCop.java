package Oct.ex_11102024.escap.accessModifiers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop JrCop = new Cop(20);
        System.out.println(JrCop.gun);
       JrCop.canIShoot();


    }
}
