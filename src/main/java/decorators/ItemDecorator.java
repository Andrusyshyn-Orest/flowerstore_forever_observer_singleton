package decorators;

import flowerstore.Item;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {

        this.item = item;
    }

    @Override
    public double getPrice() {
        return item.getPrice();
    }

}