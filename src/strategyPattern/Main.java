package strategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.executePayment(100);

        paymentContext = new PaymentContext(new CashPayment());
        paymentContext.executePayment(200);
    }
}