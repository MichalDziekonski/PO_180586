public class CardPayment implements PaymentMethod{


    @Override
    public void pay(double amount) {
        System.out.println("Platnosc wykonana karta: " + amount + " zl");
    }
}
