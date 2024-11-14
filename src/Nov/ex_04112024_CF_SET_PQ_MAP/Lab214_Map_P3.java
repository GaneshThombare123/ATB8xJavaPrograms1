package Nov.ex_04112024_CF_SET_PQ_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab214_Map_P3 {
    public static void main(String[] args) {

        HashMap<String,String> student1  = new HashMap();
        student1.put("name","Pramod");
        student1.put("rollNO","1");
        student1.put("PhoneNO","3635623");
        System.out.println(student1);

        System.out.println("------------");

        HashMap<String,String> student2  = new HashMap();
        student2.put("name","Amit");
        student2.put("rollNO","2");
        student2.put("PhoneNO","36908835623");
        System.out.println(student2);

        System.out.println("------------");

        HashMap<String,String> student3  = new HashMap();
        student3.put("name","Kumar");
        student3.put("rollNO","3");
        student3.put("PhoneNO","36350088623");
        System.out.println(student3);

        System.out.println("------------");

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

    }
}
