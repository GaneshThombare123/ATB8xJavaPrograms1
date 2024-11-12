package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab204_ArrayList_Vector {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(5);
        mylist1.add("Amit");
        mylist1.add("Pramod");
        mylist1.add("Dutta");
        mylist1.add("Sunita");
        mylist1.add("Anita");
        mylist1.add("Kiran");
        mylist1.add("Kiran");
        System.out.println(mylist1);

        Vector v = new Vector();
        v.add("Pramod");
        v.add("Anushka");
        v.add("Dutta");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Pramod"));
        System.out.println(v.indexOf("Dutta"));

    }
}