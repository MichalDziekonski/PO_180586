public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void showInformation() {
        System.out.println("Auto marki: " + super.getBrand() + ", model: " + super.getModel() + ", ilosc drzwi: " + this.numberOfDoors);
    }
}
