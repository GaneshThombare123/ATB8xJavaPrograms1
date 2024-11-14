package Nov.ex_04112024_CF_SET_PQ_MAP;

import java.util.ArrayList;
import java.util.HashSet;

public class Lab210_SET_Part2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); //order will not maintain
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Banana"); // duplicate not allow
        System.out.println("Set elements: "+ set);

        ArrayList list = new ArrayList();
        // list.add(); // Index ?--> Array index to store


    }
}
