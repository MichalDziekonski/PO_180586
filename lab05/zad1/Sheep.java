package zad1;

public class Sheep extends Animal{

    public Sheep(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meeeeee");
    }
}
