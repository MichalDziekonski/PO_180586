public class InitializationDemo {
    private static int p1 = 0;
    private int p2;

    static {
        System.out.println("Wykonaneie bloku statycznego");
    }

    {
        System.out.println("Wykonanie bloku instacyjnego");
    }

    public InitializationDemo(int p2) {
        p1++;
        this.p2 = p2;
    }
}
