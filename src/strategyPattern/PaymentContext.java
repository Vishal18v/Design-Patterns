package strategyPattern;

public class PaymentContext {
    private Payment payment;
    public PaymentContext(Payment payment) {
        this.payment = payment;
    }

    public void executePayment(int amount) {
        payment.pay(amount);
    }

}