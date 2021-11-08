package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCartStrategyTest {

    private Payment payment;
    @BeforeEach
    void setUp() {
        payment = new CreditCartPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(payment.pay(12));
    }

    @Test
    void checkinstance() {
        assertTrue(payment instanceof Payment);
        assertTrue(payment instanceof CreditCartPaymentStrategy);
    }
}