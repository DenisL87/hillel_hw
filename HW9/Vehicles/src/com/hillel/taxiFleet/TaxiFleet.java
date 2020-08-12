package com.hillel.taxiFleet;
import com.hillel.cars.*;

public class TaxiFleet implements CarsProcessor {
    public Car[] sortByFuelConsumption (Car[] car) {
        for (int i = 0; i < car.length; i++) {
            for (int y = i + 1; y < car.length; y++) {
                if ((double) car[i].getFuelConsumption() > car[y].getFuelConsumption()) {
                    Car temp = car[i];
                    car[i] = car[y];
                    car[y] = temp;
                }
            }
        }
        return car;
    }
    public Car[] findSpeed (Car[] car, int min, int max) {
        Car[] newArr = new Car[0];
        for (int i = 0; i < car.length; i++) {
            if (car[i].getSpeed() < max && car[i].getSpeed() > min) {
                newArr = extendArr(newArr, car[i]);
                car[i].toString(car[i]);
            }
        }
        return newArr;
    }
    public int fleetCost (Car[] car){
        int cost = 0;
        for (Car newCar : car){
            cost += newCar.getPrice();

        }
        return cost;
    }
    private Car[] extendArr(Car[] cars, Car car){
        Car [] newArr = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            newArr[i] = cars[i];
        }
        newArr[cars.length] = car;
        return newArr;
    }
}
