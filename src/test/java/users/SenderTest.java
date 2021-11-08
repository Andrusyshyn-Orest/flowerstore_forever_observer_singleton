package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    private Sender sender1;
    private Sender sender2;

    private Receiver receiver1;
    private Receiver receiver2;

    @BeforeEach
    void setUp() {
        sender1 = new Sender();
        sender2 = new Sender();

        receiver1 = new Receiver();
        receiver2 = new Receiver();
    }

    @Test
    void getId() {
        assertEquals(0, sender1.getId());
        assertEquals(1, sender2.getId());

        assertEquals(2, receiver1.getId());
        assertEquals(3, receiver2.getId());
    }
}