package org.example.builder;

import org.example.builder.printer.ReceiptPrinter;
import org.example.builder.printer.ReceiptPrinterImpl;
import org.example.builder.taskDetails.Item;
import org.example.builder.taskDetails.PaymentMethod;

public class Director {
    ReceiptPrinter receiptPrinter;
    public Director(){
        receiptPrinter = new ReceiptPrinterImpl();
    }
    public Order standardOrder(Builder builder) {
        return builder.addItem(new Item("Хліб", 20.5))
                .addItem(new Item("Молоко", 50.2))
                .addItem(new Item("М'ясо", 101.1))
                .setAddress("Address1")
                .setPaymentMethod(PaymentMethod.CASH)
                .build(receiptPrinter);
    }
    public Order picnicOrder(Builder builder) {
        return builder.addItem(new Item("Хліб", 20.5))
                .addItem(new Item("Шашлик", 200.2))
                .addItem(new Item("Дрова", 80.1))
                .addItem(new Item("Кетчуп", 30.9))
                .setAddress("Address2")
                .setPaymentMethod(PaymentMethod.BANK_CARD)
                .build(receiptPrinter);
    }
}
