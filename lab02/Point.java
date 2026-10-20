public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point other) {
        double wynik = x * x + y * y;

        return Math.sqrt(wynik);
    }
}
