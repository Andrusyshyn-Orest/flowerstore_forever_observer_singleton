package users;

import lombok.Getter;

@Getter
public class Receiver extends User{
    private int id;
    public Receiver() {
        this.id = super.id++;
    }
    @Override
    public void update(boolean status) {

        if (status) {
            System.out.println("I have received an order!");
        } else {
            System.out.println("I have not received an order yet!");
        }

    }
}
