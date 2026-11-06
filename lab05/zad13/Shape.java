package zad13;

public class Shape {
    public static void printShape(Shape shape) {
        System.out.println("Figura: " + shape.getName() + ", Pole: " + shape.area());
    }

    public double area() {
        return 0.0;
    }

    public String getName() {
        return "Unknown Shape";
    }
}
