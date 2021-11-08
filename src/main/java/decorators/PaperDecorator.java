package decorators;

import flowerstore.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return 13 + super.getPrice();
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