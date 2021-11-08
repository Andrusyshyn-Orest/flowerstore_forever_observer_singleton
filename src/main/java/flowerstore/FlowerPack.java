package flowerstore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack extends Item{
    private Flower flower;
    private int amount;
    public double getPrice() {
        return flower.getPrice() * amount;
    }


    public boolean isEqual(FlowerPack otherFlowerPack) {
        if ((this.getFlower().isEqual(otherFlowerPack.getFlower())) &&
                (this.getAmount() == otherFlowerPack.getAmount())) {
            return true;
        }

        return false;
    }


//    @Override
//    public void setDescription(){
////        this.description = "FlowerPack: " + this.getAmount() + " " + this.getFlower() + "; costs " + this.getPrice();
//
//    }
}
