package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab201_List_ArrayList {
    public static void main(String[] args) {
        // List List = new List();

        List list = new ArrayList();
        list.add(90);
        list.add(40);
        list.add(60);
        list.add(80);
        list.add(70);
        list.add(87);
        System.out.println(list);
        System.out.println("---sorting----");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("---reveres order-----");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}
