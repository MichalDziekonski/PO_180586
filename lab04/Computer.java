public class Computer extends Device{
    public int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }
    public void RamInfo() {
        System.out.println("ilosc RAMU to: " + ramGb + " GB");
    }
}
