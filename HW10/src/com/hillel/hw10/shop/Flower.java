package com.hillel.hw10.shop;

public class Flower extends Commodity {
    private String name;
    private double price;
    private double stemLength;
    private int daysToLive;

    public Flower (String name, double price, double stemLength, int daysToLive){
        this.name = name;
        this.price = price;
        this.stemLength = stemLength;
        this.daysToLive = daysToLive;

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
    public void setStemLength (double stemLength){
        this.stemLength = stemLength;
    }
    public double getStemLength (){
        return stemLength;
    }
    public void setDaysToLive (int daysToLive){
        this.daysToLive = daysToLive;
    }
    public int getDaysToLive (){
        return daysToLive;
    }
}