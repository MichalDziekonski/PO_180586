public class StaticCalculator {
    static int numberOfOperations;

    public static int getNumberOfOperations() {
        return numberOfOperations;
    }

    public static void add(int a, int b) {
        numberOfOperations++;
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        numberOfOperations++;
        System.out.println(a + b + c);
    }

    public static void add(double a, double b) {
        numberOfOperations++;
        System.out.println(a + b);
    }

    public static void subtract(double a, double b) {
        numberOfOperations++;
        System.out.println(a - b);
    }

    public static void multiply(double a, double b) {
        numberOfOperations++;
        System.out.println(a * b);
    }
}
