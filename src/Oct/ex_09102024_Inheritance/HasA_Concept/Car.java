package Oct.ex_09102024_Inheritance.HasA_Concept;

public class Car {
    // car Has A tyre
    // car Has a engine

    protected void startCar(){
        new Engine().Start();
        new Tyre().rolloing();
    }

}
