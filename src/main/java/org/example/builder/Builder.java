package org.example.builder;

import org.example.builder.printer.ReceiptPrinter;
import org.example.builder.taskDetails.Item;
import org.example.builder.taskDetails.PaymentMethod;

public interface Builder {
    OrderBuilder addItem(Item item);
    OrderBuilder setAddress(String address);
    OrderBuilder setPaymentMethod(PaymentMethod paymentMethod);
    Order build(ReceiptPrinter receiptPrinter);
}
