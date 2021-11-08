package flowerstore;

public class QuickOrder {

    public static Order createOrder() {
        Order newOrder = new Order();
        Item flower = new Flower(FlowerType.ROSE);
        byte color[] = {127, 0, 0};
        ((Flower) flower).setPrice(10);
        ((Flower) flower).setSepalLength(10);
        ((Flower) flower).setColor(color);

        newOrder.addItem(flower);

        return newOrder;
    }

}
