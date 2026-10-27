public class Product {
    public String name;
    public int price;
    private static int numberOfProducts;
    public static final int MAX_PRODUCTS = 3;

    public Product(String name, int price) {
        if (numberOfProducts < MAX_PRODUCTS) {
            this.name = name;
            this.price = price;
            numberOfProducts++;
        }else {
            throw new IllegalStateException("Przekroczono maksymalna liczbe produktow");
        }
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}
