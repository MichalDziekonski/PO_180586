package app;

import animals.Cat;
import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("Mruczek", 2);
        Dog d1 = new Dog("Rex", 3);

        c1.makeSound();
        d1.makeSound();
    }
}
