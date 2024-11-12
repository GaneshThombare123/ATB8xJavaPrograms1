package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab200_List_ArrayList_ForLoop {
    public static void main(String[] args) {
        // List List = new List();

        List list = new ArrayList();
        list.add("bread");
        list.add("milk");
        list.add("butter");
        list.add("paneer");
        list.add("jam");
        list.add("cheeze");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("---default for loop---");

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

            }
        System.out.println("--- for each loop---");

        for (Object o:list){
            System.out.println(o);

        }


    }
}
