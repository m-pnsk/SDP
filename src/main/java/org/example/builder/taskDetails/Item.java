package org.example.builder.taskDetails;


public class Item {
    private final String name;
    private final double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n'" + name + '\''
                + " = " + price;
    }
}
