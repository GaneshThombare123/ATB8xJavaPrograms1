package Oct.ex_14102024.realex2;

public class waganoR extends Engine {
 void drive(){
     startEngine();
     stopEngine();

 }
     @Override
    void startEngine() {
        System.out.println("Starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping car");

    }
}
