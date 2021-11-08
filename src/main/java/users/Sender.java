package users;

import flowerstore.Order;
import lombok.Getter;

@Getter
public class Sender extends User{
    private int id;
    public Sender() {
        this.id = super.id++;
    }

    @Override
    public void update(boolean status) {
        if (status) {
            System.out.println("Receiver have received an order!");
        }

        else {
            System.out.println("Receiver have not received an order yet!");
        }
    }
}
