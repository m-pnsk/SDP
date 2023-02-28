package org.example.factoryMethod.creators;

import org.example.factoryMethod.products.Letter;
import org.example.factoryMethod.products.Parcel;

public class CreatorLetter extends ParcelFactory {
    public CreatorLetter(String type) {
        super(type);
    }

    @Override
    public Parcel sendParcel() {
        return new Letter();
    }
}
