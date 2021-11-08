package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private Flower flower;
    private FlowerPack pack;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setSepalLength(10);
        flower.setPrice(100);
        byte color[] = {127, 127, 0};
        flower.setColor(color);

        pack = new FlowerPack();
        pack.setFlower(flower);
        pack.setAmount(10);
    }

    @Test
    void getPrice() {
        assertEquals(1000, pack.getPrice());
    }

    @Test
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

        FlowerPack packx = new FlowerPack();
        packx.setFlower(flowerx);
        packx.setAmount(10);

        FlowerPack packy = new FlowerPack();
        packy.setFlower(flowery);
        packy.setAmount(10);

        assertTrue(pack.isEqual(packx));
        assertFalse(pack.isEqual(packy));
    }

    @Test
    void getFlower() {
        assertEquals(flower, pack.getFlower());
    }

    @Test
    void getAmount() {
        assertEquals(10, pack.getAmount());
    }
}