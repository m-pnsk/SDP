package org.example.builder;

import org.example.builder.taskDetails.Item;
import org.example.builder.taskDetails.PaymentMethod;

import java.util.List;

public class Order {
    private final List<Item> items;
    private final String address;
    private final PaymentMethod paymentMethod;

    public Order(List<Item> items, String address, PaymentMethod paymentMethod) {
        this.items = items;
        this.address = address;
        this.paymentMethod = paymentMethod;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public double calculatePrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return Math.round(total * 100d) / 100d;
    }
}
