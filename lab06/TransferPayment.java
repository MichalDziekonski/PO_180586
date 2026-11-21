public class TransferPayment implements PaymentMethod{


    @Override
    public void pay(double amount) {
        System.out.println("Platnosc wykonana przelew: " + amount + " zl");
    }
}
