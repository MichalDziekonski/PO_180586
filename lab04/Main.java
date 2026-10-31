import Zad12.NewCar;
import Zad12.Motorcycle;
import Zad12.Truck;
import package2.Employee;
import package2.Manager;

public class Main {
    public static void main(String[] args) {
        //zad3();
        //zad4();
        //zad5();
        //zad6();
        //zad7();
        //zad8();
        //zad10();
        //zad11();
        zad12();
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

    public static void zad8() {
        Book b1 = new Book("ACB for dumy", "Jan kowalski", 2026);
        System.out.println(b1);
        System.out.println(b1.getClass());
    }

    public static void zad10() {
        Document d1 = new Document();
        Document d2 = d1.copy();

        Report r1 = new Report();
        Report r2 = r1.copy();
    }

    public static void zad11() {
        Student s1 = new Student("Michal", 180586);
        s1.showInformation();
        s1.showInformations();
    }

    public static void zad12() {
        NewCar c1 = new NewCar("1.8t", 5);
        Motorcycle m1 = new Motorcycle("Yamaha XT 660", 40);
        Truck t1 = new Truck("Cummins X15", 26);

        c1.showInfo();
        System.out.println(m1.toString());
        t1.showInfo();
    }

}
