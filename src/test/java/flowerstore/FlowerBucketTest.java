package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {

    private Flower flower;
    private Flower flower1;
    private FlowerPack pack;
    private FlowerPack pack1;
    private FlowerBucket bucket;

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

        flower1 = new Flower(FlowerType.CHAMOMILE);
        flower1.setSepalLength(7);
        flower1.setPrice(10);
        byte color1[] = {0, 127, 0};
        flower1.setColor(color1);

        pack1 = new FlowerPack();
        pack1.setFlower(flower1);
        pack1.setAmount(5);

        bucket = new FlowerBucket();
        bucket.addFlowerPack(pack);
        bucket.addFlowerPack(pack1);
    }


    @Test
    void getPrice() {
        assertEquals(1050, bucket.getPrice());
    }

    @Test
    void isEqual() {
        Flower flowerx = new Flower(FlowerType.ROSE);
        flowerx.setSepalLength(10);
        flowerx.setPrice(100);
        byte colorx[] = {127, 127, 0};
        flowerx.setColor(colorx);

        FlowerPack packx = new FlowerPack();
        packx.setFlower(flowerx);
        packx.setAmount(10);

        Flower flower1x = new Flower(FlowerType.CHAMOMILE);
        flower1x.setSepalLength(7);
        flower1x.setPrice(10);
        byte color1x[] = {0, 127, 0};
        flower1x.setColor(color1x);

        FlowerPack pack1x = new FlowerPack();
        pack1x.setFlower(flower1x);
        pack1x.setAmount(5);

        FlowerBucket bucketx = new FlowerBucket();
        bucketx.addFlowerPack(packx);
        bucketx.addFlowerPack(pack1x);

        Flower flowery = new Flower(FlowerType.ROSE);
        flowery.setSepalLength(11);
        flowery.setPrice(100);
        byte colory[] = {127, 127, 0};
        flowery.setColor(colorx);

        FlowerPack packy = new FlowerPack();
        packy.setFlower(flowery);
        packy.setAmount(10);


        FlowerBucket buckety = new FlowerBucket();
        buckety.addFlowerPack(packy);
        buckety.addFlowerPack(pack1x);

        assertTrue(bucket.isEqual(bucketx));
        assertFalse(bucket.isEqual(buckety));


    }

}