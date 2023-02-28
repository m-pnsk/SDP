package org.example.factoryMethod.creators;

import org.example.factoryMethod.products.Letter;
import org.example.factoryMethod.products.Parsel;

public class CreatorLetter extends ParcelFactory {
    public CreatorLetter(String type) {
        super(type);
    }

    @Override
    public Parsel sendParsel() {
        return new Letter();
    }
}
