package com.hillel.cars;
import com.hillel.taxiFleet.*;

public class Bus extends Car {
    public Bus(String brand, String model, int price, int speed, double fuelConsumption) {
        super(brand, model, price, speed, fuelConsumption);
    }

    public void toString(Car car) {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Fuel consumption: " + getFuelConsumption() + "\n");
    }
}
