public class Laptop extends Computer{
    public int batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, int batteryCapacityWh) {
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }

    public void BatterLive() {
        System.out.println("poejmnosc bateri to: " + batteryCapacityWh);
    }
}
