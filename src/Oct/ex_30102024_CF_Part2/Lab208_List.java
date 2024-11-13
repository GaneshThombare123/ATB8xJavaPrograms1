package Oct.ex_30102024_CF_Part2;

import java.util.ArrayList;
import java.util.List;

public class Lab208_List {
    public static void main(String[] args) {
     Student s1 = new Student("Amit",1);
     Student s2 = new Student("Anil",2);
     Student s3 = new Student("Ramesh",3);
     Student s4 = new Student("Rakesh",4);
     List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        myStudents.add(s4);
        System.out.println(s1.printDetails());
        System.out.println(s2.printDetails());
        System.out.println(s3.printDetails());
        System.out.println(s4.printDetails());
        System.out.println("---------");
        System.out.println(myStudents);

    }
}

class Student {
    String name;
    Integer rollNo;

    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }


    public String printDetails() {
        return "Student{" +
                "name=" +name  +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}