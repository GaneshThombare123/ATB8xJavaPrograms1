package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab203_ArrayList_Iterate {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Amit");
        mylist.add("Pramod");
        mylist.add("Dutta");

        System.out.println("--To Print Array List - 1 ");

        for (String str : mylist){
            System.out.println(str);

        }

        System.out.println("--To Print Array List - 2 ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));

        }

        System.out.println("--To Print Array List - 3 ");
                 //Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
