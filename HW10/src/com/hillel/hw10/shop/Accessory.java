package com.hillel.hw10.shop;

public class Accessory {
    private String name;
    private double price;

    public Accessory (String name, double price){
        this.name = name;
        this. price = price;
    }

    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }
    public void setPrice (double price){

        this.price = price;
    }
    public double getPrice (){

        return price;
    }
}
