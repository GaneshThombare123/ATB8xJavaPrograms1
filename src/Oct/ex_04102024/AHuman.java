package Oct.ex_04102024;

import javax.xml.transform.Source;

public class AHuman {

    String eyes_color;
    String name;
    long aadhar_card_number;

    AHuman(){
        System.out.println("I Will Be Called, when Object is created");

    }

    void walk(){
        System.out.println("NRNA");

    }
    int talk(){
        System.out.println("RTNA");
        return 10;

    }
      String sleep(String name){
        System.out.print("Sleeping");
          System.out.println("RTWA");
        return ("I Am Sleeping");

      }
    void eat(String name){
        System.out.println("NRWA");
        System.out.print("eat");

    }
}
