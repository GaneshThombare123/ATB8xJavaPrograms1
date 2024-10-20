package Oct.ex_11102024.escap.accessModifiers.police;

public class Cop {

    protected int gun;
    private String idCard;

    protected Cop(int gun) {
        this.gun = gun;
    }
    protected void canIShoot(){
        System.out.println(" Yes, you can!! ");
    }
}
