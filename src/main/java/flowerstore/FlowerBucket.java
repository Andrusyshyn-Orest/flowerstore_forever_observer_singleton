package flowerstore;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;

@Getter
@Setter
public class FlowerBucket extends Item{
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        super();
        flowerPacks = new ArrayList<FlowerPack>();
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }


    public boolean isEqual(FlowerBucket otherFlowerBucket) {
        if (!(this.flowerPacks.size() == otherFlowerBucket.flowerPacks.size())) {
            return false;
        }

        int size = this.flowerPacks.size();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            FlowerPack pack = flowerPacks.get(i);

            for (int j = 0; j < size; j++) {
                if (pack.isEqual(otherFlowerBucket.getFlowerPacks().get(j))) {
                    found = true;
                }
            }

            if (!found) {
                return false;
            } else {
                found = false;
            }
        }


        return true;
    }


//    @Override
//    public void setDescription(){
////        this.description = "FlowerBucket: costs " + this.getPrice();
//    }
}