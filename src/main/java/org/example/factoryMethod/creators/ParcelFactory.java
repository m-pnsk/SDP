package org.example.factoryMethod.creators;

import org.example.factoryMethod.products.Parsel;

public abstract class ParcelFactory {
    private String type;
    ParcelFactory(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract Parsel sendParsel();
}
