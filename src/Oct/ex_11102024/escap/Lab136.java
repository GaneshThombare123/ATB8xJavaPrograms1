package Oct.ex_11102024.escap;

public class Lab136 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hack";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("goodadmin", "admin123");

        //System.out.println(vwoLogin1.password);

        System.out.println(vwoLogin1.getPassword());

        // checking Admin
        boolean isAdmin = false;

        vwoLogin1.setPassword("newpassword", isAdmin);
        System.out.println(vwoLogin1.getPassword());

        }
    }


