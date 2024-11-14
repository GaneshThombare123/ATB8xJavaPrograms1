package Nov.ex_04112024_CF_SET_PQ_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab213_Map_P2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",null);
        map.put("id4",4);
        map.put(null, 100);
       // map.put(null, 200); // duplicate not allow
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.keySet());

        System.out.println(map.containsValue(34));
        System.out.println("----------------");

        for(Map.Entry<String,Integer> iteam: map.entrySet()){
            System.out.println(iteam.getKey() + "-->" + iteam.getValue());
        }

    }
}
