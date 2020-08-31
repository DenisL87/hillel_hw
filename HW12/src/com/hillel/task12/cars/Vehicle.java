package com.hillel.task12.cars;

public class Vehicle {
    private int price;
    private int speed;
    private double fuelConsumption;
    private String brand;
    private String model;

    public Vehicle (String brand, String model, int price, int speed, double fuelConsumption){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
}
