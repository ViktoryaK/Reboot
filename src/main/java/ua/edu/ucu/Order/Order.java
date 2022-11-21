package ua.edu.ucu.Order;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.Delivery.DHLDeliveryStrategy;
import ua.edu.ucu.Delivery.Delivery;
import ua.edu.ucu.Items.Item;
import ua.edu.ucu.Payment.Payment;

import javax.persistence.*;
import java.util.LinkedList;

public class Order {
    @Getter
    private String paymentStrategy = "";
    @Getter
    private String deliveryStrategy = "";
    private LinkedList<Item> items = new LinkedList<>();

    @Setter
    private boolean st = false;
    private double all_price = 0;

    public void setPaymentStrategy(Payment pay) {
        if (pay.getClass().isInstance("CreditCardPaymentStrategy")) {
            paymentStrategy = "CreditCardPaymentStrategy";
        }
        else {
            paymentStrategy = "PayPalPaymentStrategy";
        }
    }

    public void setDeliveryStrategy(Delivery del) {
        if (del.getClass().isInstance("DHLDeliveryStrategy")) {
            deliveryStrategy = "DHLDeliveryStrategy";
        }
        else {
            deliveryStrategy = "PostDeliveryStrategy";
        }
    }

    public double CalculateTotalPrice() {
        for (Item it: items) {
            all_price += it.getPrice();
        }
        return 0;
    }

    public boolean processOrder() {
        if (this.st) {
            return true;
        }
        else {return false;}
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

}
