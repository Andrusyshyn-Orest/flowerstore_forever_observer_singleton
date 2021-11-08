package delivery;

import decorators.PaperDecorator;
import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {

    private Delivery delivery;

    @BeforeEach
    void setUp() {
        delivery = new DHLDeliveryStrategy();

    }

    @Test
    void deliver() {
        List<Item> items;
        items = new LinkedList<>();

        Item flower = new Flower(FlowerType.ROSE);
        byte color[] = {127, 0, 0};
        ((Flower) flower).setPrice(10);
        ((Flower) flower).setSepalLength(10);
        ((Flower) flower).setColor(color);
        flower.setDescription("Beautiful Flower");

        items.add(flower);
        assertTrue(delivery.deliver(items));
    }

    @Test
    void checkInstance() {
        assertTrue(delivery instanceof Delivery);
        assertTrue(delivery instanceof DHLDeliveryStrategy);
    }

}