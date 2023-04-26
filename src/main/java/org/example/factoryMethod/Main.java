package org.example.factoryMethod;

import org.example.factoryMethod.creators.*;
import org.example.factoryMethod.products.Parcel;

public class Main {
    public static void main(String[] args) {
        // Створюємо Фабрики по створенню посилок: листів та пакетів.
        ParcelFactory letter = new CreatorLetter("letter");
        ParcelFactory packet = new CreatorPacket("packet");

        // Надсилаємо посилки
        Parcel ltr = letter.sendParcel();
        Parcel pct = packet.sendParcel();

        // Перевіряємо чи коректно працює поштове відділення :)
        System.out.print("В даній посилці має міститися лист. Відкриваємо... -> В посилці: ");
        ltr.typeOfParcel();
        System.out.print("В даній посилці має міститися пакет. Відкриваємо... -> В посилці: ");
        pct.typeOfParcel();
    }
}