package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {

    private Payment payment;
    @BeforeEach
    void setUp() {
        payment = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(payment.pay(10));
    }

    @Test
    void checkinstance() {
        assertTrue(payment instanceof Payment);
        assertTrue(payment instanceof PayPalPaymentStrategy);
    }
}
