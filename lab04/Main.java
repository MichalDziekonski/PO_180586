import package2.Employee;
import package2.Manager;

public class Main {
    public static void main(String[] args) {
        //zad3();
        //zad4();
        //zad5();
        //zad6();
        zad7();
    }

    public static void zad3() {
        Car c1 = new Car("Audi", "a3", 3);
        c1.showInformation();
    }

    public static void zad4() {
        // Odpali sie w kolejnosc A -> B -> C
        C c = new C();
    }

    public static void zad5() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
    }

    public static void zad6() {
        Employee e1 = new Employee("Jan", "Kowalski");
        Manager m1 = new Manager("Adam", "Nowak", "Transport");

        e1.showInformation();
        m1.showInformation();
    }

    public static void zad7() {
        Laptop l1 = new Laptop("Asus", 16, 5000);
        l1.whoManufacturer();
        l1.RamInfo();
        l1.BatterLive();
    }
}