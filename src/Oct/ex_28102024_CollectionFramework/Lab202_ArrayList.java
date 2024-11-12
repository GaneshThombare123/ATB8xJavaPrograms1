package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab202_ArrayList {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList(); // not use int(small int) due to collection framework not allow
        l.add(45);
       // l.add("Ganesh"); // not allow string due to integer type of array

        List<String> names = new ArrayList();
        names.add("Ganesh");
      //  names.add(123); // not allow integer due to string type of array

    }
}
