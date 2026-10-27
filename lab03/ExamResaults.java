import java.util.Arrays;

public class ExamResaults {
    private int[] points;

    public ExamResaults(int[] points) {
        this.points = Arrays.copyOf(points, points.length);
    }

    public int[] getPoints() {
        return Arrays.copyOf(this.points, this.points.length);
    }

    public void setPoints(int[] points) {
        this.points = Arrays.copyOf(points, points.length);
    }
}
