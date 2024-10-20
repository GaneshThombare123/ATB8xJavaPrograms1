package Oct.ex_11102024.escap.example;

public class Lab137 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        //amit.setBal(100000);
        // this should allow only to admin

        boolean is_you_admin = true;
        ICICIBank admin = new ICICIBank("admin", 10000);
        admin.setBal(5000, true);
        System.out.println(admin.getName(is_you_admin));






    }
}
