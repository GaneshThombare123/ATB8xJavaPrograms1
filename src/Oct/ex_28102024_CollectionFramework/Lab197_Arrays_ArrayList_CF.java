package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;

public class Lab197_Arrays_ArrayList_CF {
    public static void main(String[] args) {

        // Collection - Interface
        // List - Interface
        // ArrayList, LinkedList, Stack and Vector -- all are classes

        ArrayList studentList = new ArrayList();  // no fixed size
        studentList.add("Pramod");
        studentList.add("Pramod");  // duplicate is allowed
        studentList.add("Dutta");
        studentList.add("Amit");
        studentList.add("Anil");
        studentList.add(123);  // diffrent data type also allowed
        studentList.add(true);
        studentList.add(null);
        System.out.println(studentList);


    }
}
