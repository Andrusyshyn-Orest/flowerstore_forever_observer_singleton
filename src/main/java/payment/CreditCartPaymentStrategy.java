package payment;

import payment.Payment;

public class CreditCartPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Paid %f with CreditCart\n", price);
        return true;
    }
}

