package Oct.ex_16102024;

public class Lab155 {
    public static void main(String[] args) {
        ATB s1 = new ATB("Amit");
        ATB s2 = new ATB("Suraj");
        ATB s3 = new ATB("Tushr");
        ATB s4 = new ATB("Balam");
        ATB s5;
        new ATB("pramod");

        s1.readDocuments();
        s2.readDocuments();
        
        ATB.doAssgnment();

    }
}
class ATB{
    {
        System.out.println("IIB");
        // what is the purpose?
        // here you can write code related to
        // start a website or anything before starting the
        // web automation or API automation.

        System.out.println(" Reading from CSV files ");

    }

        static {

            System.out.println(" Load teh class? I will execute  ");
        }
            private String name;
            private String phone;
            private String courseName = "ATB";

    public ATB(String pramod) {

    }

    public static void doAssgnment() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void ATB(String name) {
        this.name = name;
    }
    void readDocuments(){
        System.out.println("Non Static method");
    }
    void doAssignment(){
        System.out.println(phone);
        System.out.println("Do Assignment");
    }
}

