public class Car {
    String brand;
    String model;
    int productioYear;
    double mileage;

    public Car(String brand, String model, int productioYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productioYear = productioYear;
        this.mileage = mileage;
    }

    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.productioYear = other.productioYear;
        this.mileage = other.mileage;
    }

    public void distance(double value){
        this.mileage += value;
    }

    public void showInformation(){
        System.out.println(this.brand + " " + this.model + " " + productioYear + " przejechal: " + mileage);
    }
}
