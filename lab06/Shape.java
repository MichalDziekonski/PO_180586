public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
        System.out.println("Konstruktor Shape");
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public void printInformation() {
        System.out.println("Figura: " + this.getName() + ", Pole: " + this.area());
    }
}
