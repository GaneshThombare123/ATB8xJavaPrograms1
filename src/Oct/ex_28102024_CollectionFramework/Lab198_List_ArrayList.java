package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab198_List_ArrayList {
    public static void main(String[] args) {
        // List List = new List();

        List list = new ArrayList();
         list.add("1");
         list.add("2");
         list.add("3");
         list.add("3"); //duplicate can allow
         list.add("4");
         list.add("Apple");
         list.add("Guava");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list);
        System.out.println(list.contains("1")); // string-- so it is true
        //System.out.println(list.contains(1)); // integer-- so it is false
        System.out.println(list.contains("2"));



    }
}

