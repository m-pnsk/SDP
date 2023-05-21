package org.example.builder.printer;

import org.example.builder.Order;

public interface ReceiptPrinter {
    void print(Order order);
}
