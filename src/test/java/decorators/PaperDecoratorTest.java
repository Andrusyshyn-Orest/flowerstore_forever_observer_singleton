package decorators;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {

    @Test
    void getPrice() {
        Item flower = new Flower(FlowerType.ROSE);
        byte color[] = {127, 0, 0};
        ((Flower) flower).setPrice(10);
        ((Flower) flower).setSepalLength(10);
        ((Flower) flower).setColor(color);

        assertEquals(10, flower.getPrice());

        Item flower_dec = new PaperDecorator(flower);

        assertEquals(23, flower_dec.getPrice());

        Item pack = new FlowerPack();
        ((FlowerPack) pack).setFlower((Flower)flower);
        ((FlowerPack) pack).setAmount(10);

        assertEquals(100, pack.getPrice());

        Item pack_dec = new PaperDecorator(pack);

        assertEquals(113, pack_dec.getPrice());

        Item bucket = new FlowerBucket();
        ((FlowerBucket)bucket).addFlowerPack((FlowerPack) pack);

        assertEquals(100, bucket.getPrice());

        Item bucket_dec = new PaperDecorator(bucket);

        assertEquals(113, bucket_dec.getPrice());



    }
}