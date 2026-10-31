public class Device {
    public String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void whoManufacturer() {
        System.out.println("Wyprodukowane przez: " + manufacturer);
    }
}
