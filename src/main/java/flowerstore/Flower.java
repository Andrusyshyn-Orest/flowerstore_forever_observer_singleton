package flowerstore;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class Flower extends Item{
    private double price;
    private double sepalLength;
    private byte[] color;
    // rgb -128 to 127

    private FlowerType flowerType;

    public void setColor(byte[] color){
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType) {
        super();
        this.flowerType = flowerType;
    }

    public boolean isEqual(Flower otherFlower) {

        if ((this.getFlowerType() == otherFlower.getFlowerType() ) &&
                (Arrays.equals(this.getColor(), otherFlower.getColor())) &&
                (this.getSepalLength() == otherFlower.getSepalLength())) {
            return true;
        }

        return false;
    }

//    public void setDescription(){
////        this.description = "Flower: " + getFlowerType() + "; color: " + Arrays.toString(getColor()) + "; sepallength: " +
////                getSepalLength() + "; costs: " + getPrice();
//    }

}
