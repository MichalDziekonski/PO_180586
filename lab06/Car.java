public class Car {
    private Engine engine;
    private Gearbox gearbox;

    public Car(Engine engine, Gearbox gearbox) {
        this.engine = engine;
        this.gearbox = gearbox;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        System.out.println("Silnik " + this.getEngine().getModel() + " startuje");
    }
}
