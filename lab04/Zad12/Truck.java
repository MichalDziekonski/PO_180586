package Zad12;

public class Truck extends Vehicle {
    private int capacity;

    public Truck(String engine, int capacity) {
        super(engine);
        this.capacity = capacity;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Pojemosc: " + capacity + " ton");
    }
}
