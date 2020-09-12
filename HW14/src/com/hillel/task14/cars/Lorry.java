package com.hillel.task14.cars;

public class Lorry extends Vehicle {
    double carryingCapacity;

    public Lorry(String brand, String model, int price, int speed, double fuelConsumption, double carryingCapacity) {
        super(brand, model, price, speed, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }
    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
    public double getCarryingCapacity() {
        return carryingCapacity;
    }
}
