package org.example.builder;

import java.util.Arrays;

public class MainBuilder {
    public static void main(String[] args) {
        Director director = new Director();

        // Формування першого замовлення
        Order standart = director.standartOrder(new OrderBuilder());
        System.out.println(print(standart));

        // Формування другого замовлення
        Order picnic = director.picnicOrder(new OrderBuilder());
        System.out.println(print(picnic));
    }
    public static String print(Order order) {
        return "Список покупок: " + Arrays.toString(order.getItems().toArray())
                + "\n____________________\nАдреса доствки: " + order.getAddress()
                + "\nСпосіб оплати: " + order.getPaymentMethod().name()
                + "\nСумарна вартість: " + order.calculatePrice() + "\n";
    }
}
