package Oct.ex_30102024_CF_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab209_SET {
    public static void main(String[] args) {
        // List - Duplicate Allows
        // Set -  Doesn't allow Duplicate

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("pramod");
        hs.add("dramod");
        hs.add("Sramod");
        hs.add("Pramod"); // Duplicate not allows and print only one
        System.out.println(hs);




    }
}
