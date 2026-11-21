public class OrderService {
    PaymentMethod paymentMethod;

    public OrderService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        paymentMethod.pay(amount);
    }
}
