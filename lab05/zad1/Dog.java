package zad1;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void digHole() {
        System.out.println("Dog dig a hole");
    }

    public static void identify(Dog dog) {
        System.out.println("Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Wooof Wooof");
    }
}
