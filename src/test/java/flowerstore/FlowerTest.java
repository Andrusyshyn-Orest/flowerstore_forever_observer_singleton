package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setSepalLength(10);
        flower.setPrice(100);
        byte color[] = {127, 127, 0};
        flower.setColor(color);
    }

    @org.junit.jupiter.api.Test
    void isEqual() {
        byte[] colorx = {127, 127, 0};
        Flower flowerx = new Flower(FlowerType.ROSE);
        flowerx.setColor(colorx);
        flowerx.setPrice(100);
        flowerx.setSepalLength(10);

        byte[] colory = {127, 1, 0};
        Flower flowery = new Flower(FlowerType.ROSE);
        flowery.setColor(colory);
        flowery.setPrice(10);
        flowery.setSepalLength(10);

        assertTrue(flower.isEqual(flowerx));
        assertFalse(flower.isEqual(flowery));
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(100, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(10, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        byte colorx[] = {127, 127, 0};
        assertArrayEquals(colorx, flower.getColor());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }


}
