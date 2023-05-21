package org.example.builder.printer;

import org.example.builder.Order;

import java.util.Arrays;

public class ReceiptPrinterImpl implements ReceiptPrinter {
    @Override
    public void print(Order order) {
        System.out.println("Список покупок: " + Arrays.toString(order.getItems().toArray())
                + "\n____________________\nАдреса доствки: " + order.getAddress()
                + "\nСпосіб оплати: " + order.getPaymentMethod().name()
                + "\nСумарна вартість: " + order.calculatePrice() + "\n");
    }
}
