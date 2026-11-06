public class BlikPaymant extends Payment{
    public BlikPaymant(String type) {
        super(type);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Płatność BLIK: " + amount);
    }
}
