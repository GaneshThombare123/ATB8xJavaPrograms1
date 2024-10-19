package Oct.ex_04102024.Constructors.PC;

import java.util.SortedMap;

public class Dog {
    String name;
    String breed;
    int age;
    int legs;

// Default constructor
    Dog (){
        System.out.println("I an a default constructor");
        System.out.println("God is Happy!!");
    }
Dog(String breed){
    System.out.println("I am a parameterised constructor");
    this.breed = breed;
}
    Dog(String breed, String name, int age, int legs) {
        System.out.println("I am a parameterised constructor");
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.legs = legs;
    }
    void walk(){

    }
}
