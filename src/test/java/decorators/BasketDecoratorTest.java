package decorators;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {

    @Test
    void getPrice() {
        Item flower = new Flower(FlowerType.ROSE);
        byte color[] = {127, 0, 0};
        ((Flower) flower).setPrice(10);
        ((Flower) flower).setSepalLength(10);
        ((Flower) flower).setColor(color);

        assertEquals(10, flower.getPrice());

        Item flower_dec = new BasketDecorator(flower);

        assertEquals(14, flower_dec.getPrice());

        Item pack = new FlowerPack();
        ((FlowerPack) pack).setFlower((Flower)flower);
        ((FlowerPack) pack).setAmount(10);

        assertEquals(100, pack.getPrice());

        Item pack_dec = new BasketDecorator(pack);

        assertEquals(104, pack_dec.getPrice());

        Item bucket = new FlowerBucket();
        ((FlowerBucket)bucket).addFlowerPack((FlowerPack) pack);

        assertEquals(100, bucket.getPrice());

        Item bucket_dec = new BasketDecorator(bucket);

        assertEquals(104, bucket_dec.getPrice());



    }
}