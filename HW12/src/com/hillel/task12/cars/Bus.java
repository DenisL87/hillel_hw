package com.hillel.task12.cars;

public class Bus extends Vehicle {
    private int noOfSeats;

    public Bus(String brand, String model, int price, int speed, double fuelConsumption, int noOfSeats) {
        super(brand, model, price, speed, fuelConsumption);
        this.noOfSeats = noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    public int getNoOfSeats() {
        return noOfSeats;
    }
}
