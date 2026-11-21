public class BlikPayment implements PaymentMethod{


    @Override
    public void pay(double amount) {
        System.out.println("Platnosc wykonana blik: " + amount + " zl");
    }
}
