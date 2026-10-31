package Zad12;

public class Motorcycle extends Vehicle {
    private int acceleration;

    public Motorcycle(String engine, int acceleration) {
        super(engine);
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Motocykl ma przyśpieszenie: " + acceleration + "km na godzinę z silnikiem: " + engine;
    }
}
