package zad1;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal make a sound");
    }

    public static void presentAnimal(Animal animal) {
        animal.makeSound();
    }

    public static void specialAction(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.digHole();
        } else if (animal instanceof Cat cat) {
            cat.climb();
        }else {
            System.out.println("Animal is sleeping");
        }
    }

    public static void makeSound(Animal animal) {
        animal.makeSound();
    }

    public static void indentify(Animal animal) {
        System.out.println("Animal");
    }
}
