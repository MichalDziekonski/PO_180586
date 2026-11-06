package zad1;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void climb() {
        System.out.println("cat climb a wall");
    }

    @Override
    public void makeSound() {
        System.out.println("Mew Mew");
    }
}
