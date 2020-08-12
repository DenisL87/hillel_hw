package com.hillel.cars;

public abstract class Car{
    private int price;
    private int speed;
    private double fuelConsumption;
    private String brand;
    private  String model;
    Car (String brand, String model, int price, int speed, double fuelConsumption){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getPrice (){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public int getSpeed (){
        return speed;
    }
    public void setSpeed (int speed){
        this.speed = speed;
    }

    public double getFuelConsumption (){
        return fuelConsumption;
    }
    public void setFuelConsumption (double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public abstract void toString (Car car);
}