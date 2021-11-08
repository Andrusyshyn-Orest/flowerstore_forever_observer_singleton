package flowerstore;

import delivery.Delivery;
import lombok.Getter;
import payment.Payment;
import users.User;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;
    private List<User> users;

    public Order() {
        items = new LinkedList<>();
        users = new LinkedList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void removeUser(User user) {
        this.users.remove(user);
    }

    private void notifyUsers() {
        for (User user: this.users) {
            user.update(true);
        }
    }

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.payment = paymentStrategy;
    }

    public void setDeliveryStrategy(Delivery deliveryStrategy){
        this.delivery = deliveryStrategy;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item: this.items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void processOrder() {
        this.payment.pay(this.calculateTotalPrice());
        this.delivery.deliver(this.items);
    }

    public void order() {
        this.notifyUsers();
    }

}