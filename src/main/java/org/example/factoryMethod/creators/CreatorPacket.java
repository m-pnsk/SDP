package org.example.factoryMethod.creators;

import org.example.factoryMethod.products.Packet;
import org.example.factoryMethod.products.Parcel;

public class CreatorPacket extends ParcelFactory {

    public CreatorPacket(String type) {
        super(type);
    }

    @Override
    public Parcel sendParcel() {
        return new Packet();
    }
}
