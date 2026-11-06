import zad1.*;
import zad4.*;
import zad13.*;

public class Main {
    static void main(String[] args) {
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        //zad5();
        //zad6();
        //zad7();
        //zad8();
        //zad9();
        //zad10();
        //zad11();
        //zad12();
        zad13();
    }

    static void zad1() {
        Animal a1 = new Dog("Rex");
        Animal a2 = new Cat("Puszek");

        a1.makeSound();
        a2.makeSound();

        // typ referecji to Animal
        // typ rzeczywisty to Dog
        // wersja związana z Dog
        // nie ponieważ Dog jest typu referecyjnego Animal
    }

    static void zad2() {
        Animal[] animals = {
                new Cat("Puszek"),
                new Cow("Kropka"),
                new Dog("Rex"),
                new Sheep("Shaun")
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    static void zad3() {
        Animal.presentAnimal(new Cat("Puszek"));
        Animal.presentAnimal(new Cow("Kropka"));
        Animal.presentAnimal(new Dog("Rex"));

        //nie potrzebujemy trzech roznych metod present z wzgledu na polimorfizm i dziedziczeniu po animal
    }

    static void zad4() {
        Employee[] employees = {
                new Employee(),
                new Tester(),
                new Developer(),
                new Manager(),
                new Administrator()
        };

        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary(1000));
        }
    }

    static void zad5() {
        Dog d1 = new Dog("Rex");
        Animal animal = d1;

        d1.makeSound();
        // Nie licząc standardowych metod dla klasy Objeckt mozna tez wywolac metody z Dog

        animal.makeSound();
        // Nie licząc standardowych metod dla klasy Objeckt mozna tez wywolac metody z Dog

        System.out.println(d1.getName());
        animal.setName("Mailo");
        System.out.println(d1.getName());
    }

    static void zad6() {
        Animal a1 = new Dog("Rex");
        Animal a2 = new Cat("Puszek");

        Dog a3 = (Dog) a2;
        //a3.digHole();
        // Skutokowalo to bledem class "zad1i2i3.Cat cannot be cast to class zad1i2i3.Dog"
    }

    static void zad7() {
        Animal.specialAction(new Dog("Rex"));
        Animal.specialAction(new Cat("Puszek"));
        Animal.specialAction(new Cow("Kropka"));
    }

    static void zad8() {
        Animal.makeSound(new Dog("Rex"));
        Animal.makeSound(new Cat("Puszek"));
        Animal.makeSound(new Cow("Kropka"));
    }

    static void zad9() {
        Parent o1 = new Child();

        System.out.println(o1.value);
        System.out.println(o1.getValue());

        // pola value nie sa poliformiczne
    }

    static void zad10() {
        Animal a1 = new Dog("Rex");

        Animal.indentify(a1);
        Dog.indentify(a1);
        a1.makeSound();

        // wyswietli Animal
        // wykona metode z Dog
        // metoda indentify nie jest polimorficzna
    }

    static void zad11() {
        Animal animal = new GuideDog("Rex");

        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof GuideDog);
        System.out.println(animal.getClass() == Animal.class);
        System.out.println(animal.getClass() == Dog.class);
        System.out.println(animal.getClass() == GuideDog.class);

        // true, true, true, false, false, true
    }

    static void zad12() {
        Payment[] payments = {
                new CardPayment("Card"),
                new BlikPaymant("Blik"),
                new TransferPayment("Transfer")
        };

        for (Payment payment : payments) {
            payment.pay(99.99);
        }
    }

    static void zad13() {
        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Triangle(3.0, 8.0)
        };

        for (Shape shape : shapes) {
            Shape.printShape(shape);
        }
    }
}
