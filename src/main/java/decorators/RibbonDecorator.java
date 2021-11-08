package decorators;

import flowerstore.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 40 + super.getPrice();
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