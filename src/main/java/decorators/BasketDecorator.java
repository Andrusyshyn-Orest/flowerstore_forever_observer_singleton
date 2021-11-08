package decorators;

import flowerstore.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 4 + super.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public void setDescription(String descr){

        item.setDescription(descr);
    }

}