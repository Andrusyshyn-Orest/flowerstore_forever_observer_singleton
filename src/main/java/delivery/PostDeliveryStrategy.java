package delivery;

import flowerstore.Item;

import java.util.List;


public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("You are using PostDelivery to deliver " + items.toString() + "\n");
        return true;
    }
}