package org.example.factoryMethod.products;

public class Letter implements Parcel {

    @Override
    public void typeOfParcel() {
        System.out.println("Letter");
    }
}
