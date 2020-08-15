package com.hillel.hw10.shop;

public class Flower extends Commodity {
    private double stemLength;
    private int daysToLive;

    public Flower (String name, double price, double stemLength, int daysToLive){
        super(name, price);
        this.stemLength = stemLength;
        this.daysToLive = daysToLive;

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