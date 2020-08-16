package com.hillel.hw10.shop;

public class Accessory extends Commodity {
    private String name;
    private double price;
    public Accessory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    String getName() {
        return null;
    }

    @Override
    double getPrice() {
        return 0;
    }

    @Override
    double getStemLength() {
        return 0;
    }

    @Override
    int getDaysToLive() {
        return 0;
    }
}
