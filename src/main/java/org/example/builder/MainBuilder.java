package org.example.builder;

import org.example.builder.printer.ReceiptPrinter;
import org.example.builder.printer.ReceiptPrinterImpl;

import java.util.Arrays;

public class MainBuilder {
    public static void main(String[] args) {
        Director director = new Director();
        // Формування першого замовлення
        Order standard = director.standardOrder(new OrderBuilder());
        // Формування другого замовлення
        Order picnic = director.picnicOrder(new OrderBuilder());}
}
