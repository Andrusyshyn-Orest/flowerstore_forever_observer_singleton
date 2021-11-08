package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {

    @Test
    void createOrder() {
        Order order = QuickOrder.createOrder();

        assertEquals(10, order.calculateTotalPrice());
    }
}