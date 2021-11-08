package db;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    @Test
    void getThisConnection() {
        Connection c1 = Connection.getThisConnection();
        Connection c2 = Connection.getThisConnection();

        assertTrue(c1 == c2);
    }
}