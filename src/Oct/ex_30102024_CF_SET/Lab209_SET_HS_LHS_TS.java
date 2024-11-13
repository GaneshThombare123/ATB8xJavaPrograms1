package Oct.ex_30102024_CF_SET;

import java.util.*;

public class Lab209_SET_HS_LHS_TS {
    public static void main(String[] args) {

        Set hs = new HashSet(); //Hashing mechanism to store the element, no order
        hs.add("Apple");
        hs.add("Dapple");
        hs.add("Orange");
        hs.add("WaterMelon"); // duplicate not print (not allow)
        hs.add(null);
        System.out.println(hs);
        System.out.println("-------");

        Set lhs = new LinkedHashSet(); // linkedList mechanism to store the element, order
        lhs.add("Apple");
        lhs.add("Dapple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon"); // Duplicate not allow
        lhs.add(null);
        System.out.println(lhs);

        System.out.println("--------");

        Set ts = new TreeSet(); // order will maintain and natural sorting
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
        //ts.add(null); // not allow due to sorting here
        System.out.println(ts);
        System.out.println("------------");


        for (Object o:ts){
            System.out.println(o);
        }
        System.out.println("-----------------");

        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
