package Oct.ex_11102024.escap.example;

public class ICICIBank {
    //Encapsulations
    // data members should be private in nature

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName(boolean isAdmin) {
        if (isAdmin) {
            return name;
        } else
            return "null";
    }
    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {
        if (isAdmin) {
            this.bal = bal;
            System.out.println("Allowed");
        } else {
            System.out.println("Not allowed!");
        }
    }
}