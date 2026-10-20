public class Product {
    String name;
    double price;

    public Product(String name, double price) { //Nie powinno byc typu zwracanego void
        this.name = name; //brakowało this. przed nazwą zmiennej
        this.price = price; //brakowało this. przed nazwą zmiennej
    }

    public void show() {
        System.out.println(name + ": " + price);
    }
}
