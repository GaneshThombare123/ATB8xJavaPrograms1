package Nov.ex_04112024_CF_SET_PQ_MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab212_Map {
    public static void main(String[] args) {
        // Map- it is Key and value pair

        Map m1 = new HashMap(); // order will not maintain
       // Map m1 = new LinkedHashMap(); // order will maintain
       // Map m1 = new TreeMap();

        m1.put("name","Pramod");
        m1.put("rollNo",123);
        m1.put("Phone",976334983);
        System.out.println(m1);

    }
}
