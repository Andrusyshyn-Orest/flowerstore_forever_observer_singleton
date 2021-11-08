package delivery;

import flowerstore.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        System.out.println("You are using DHLDelivery to deliver " + items.toString() + "\n");
        return true;
    }
}