package Zad12;

public class NewCar extends Vehicle {
    private int numberOfDoor;

    public NewCar(String engine, int numberOfDoor) {
        super(engine);
        this.numberOfDoor = numberOfDoor;
    }

    @Override
    public void showInfo() {
        System.out.println("Auto ma: " + numberOfDoor + " i model silnika: " + engine);
    }


}
