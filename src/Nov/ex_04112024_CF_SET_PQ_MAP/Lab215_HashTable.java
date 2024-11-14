package Nov.ex_04112024_CF_SET_PQ_MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab215_HashTable {
    public static <Hashmap> void main(String[] args) {
        //Map Hashmap allow 1 null

        //Hash table - null not allow

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        ht1.put(1,"One");
        ht1.put(2,"two");
        ht1.put(3,"three");
       // ht1.put(0,null);
       // ht1.put(4,null);
       // ht1.put(5,null);
        System.out.println(ht1);

//        HashMap<Integer,String> ht2 = new HashMap<>();
//        ht2.put(1,"One");
//        ht2.put(2,"two");
//        ht2.put(3,"three");
//        ht2.put(0,null);
//        // ht1.put(4,null);
//        // ht1.put(5,null);
//        System.out.println(ht1);

        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
