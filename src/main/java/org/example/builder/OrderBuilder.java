package org.example.builder;

import org.example.builder.taskDetails.Item;
import org.example.builder.taskDetails.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder implements Builder{
    private List<Item> items;
    private String address;
    private PaymentMethod paymentMethod;

    public OrderBuilder() {
        items = new ArrayList<>();
    }

    @Override
    public OrderBuilder addItem(Item item) {
        items.add(item);
        return this;
    }

    @Override
    public OrderBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public OrderBuilder setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    @Override
    public Order build() {
        return new Order(items, address, paymentMethod);
    }

}
