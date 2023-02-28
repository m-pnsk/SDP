package org.example.factoryMethod.creators;

import org.example.factoryMethod.products.Packet;
import org.example.factoryMethod.products.Parsel;

public class CreatorPacket extends ParcelFactory {

    public CreatorPacket(String type) {
        super(type);
    }

    @Override
    public Parsel sendParsel() {
        return new Packet();
    }
}
