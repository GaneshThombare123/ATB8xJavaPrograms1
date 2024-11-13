package Oct.ex_30102024_CF_Part2;

import java.util.Stack;

public class Lab207_Stack {
    public static void main(String[] args) {
        //Stack -- is workred on LIFO principal

        Stack s = new Stack();
        s.add("Pramod");
        s.add("Dutta");
        s.add("Amit");
        System.out.println(s);

        Stack books = new Stack();
        books.push("Python");
        books.push("Java");
        books.push("C#");
        System.out.println(books);
        System.out.println("----");
       // System.out.println(books.pop()); // remove C#
       // System.out.println(books.pop()); // remove Java
      //  System.out.println(books.pop()); // remove Python
        System.out.println(books.peek()); // give you last element
        System.out.println("----");
        System.out.println(books);
        System.out.println("----");
      //  System.out.println(books.pop());
       // System.out.println("---");
        System.out.println(books);
        System.out.println(books.add("C"));
        System.out.println(books.size());
        System.out.println(books.empty());
        System.out.println(books);
        books.add(0 ,"Salesforce");
        System.out.println(books);
    }
}
