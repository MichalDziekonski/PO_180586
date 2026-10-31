package Zad12;

public class Vehicle {
    protected String engine;

    public Vehicle(String engine) {
        this.engine = engine;
    }

    public   void showInfo() {
        System.out.println("Model silnika: " + engine);
    }
}
