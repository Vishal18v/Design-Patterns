package strategyPattern;

public interface Payment {
    void pay(int amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using credit card");
    }
}

class CashPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using cash");
    }
}