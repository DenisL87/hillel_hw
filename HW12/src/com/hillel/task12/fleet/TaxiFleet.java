package com.hillel.task12.fleet;

import com.hillel.task12.cars.Vehicle;

public class TaxiFleet {

    private Vehicle[] vehicle;
    /*public TaxiFleet (Vehicle[] vehicle){
        this.vehicle = vehicle;
    }*/
    public TaxiFleet(){}
    public int fleetCost (){
        int cost = 0;
        for (Vehicle newVehicle : vehicle){
            cost += newVehicle.getPrice();

        }
        return cost;
    }
    public Vehicle[] findSpeed (int min, int max) {
        Vehicle[] newArr = new Vehicle[0];
        for (Vehicle vehicles : vehicle) {
            if (vehicles.getSpeed() < max && vehicles.getSpeed() > min) {
                newArr = extendArr(newArr, vehicles);
            }
        }
        return newArr;
    }

    public Vehicle[] sortByFuelConsumption () {
        for (int i = 0; i < vehicle.length; i++) {
            for (int y = i + 1; y < vehicle.length; y++) {
                if (vehicle[i].getFuelConsumption() > vehicle[y].getFuelConsumption()) {
                    Vehicle temp = vehicle[i];
                    vehicle[i] = vehicle[y];
                    vehicle[y] = temp;
                }
            }
        }
        return vehicle;
    }

    public Vehicle[] extendArr(Vehicle[] vehicles, Vehicle vehicle){
        Vehicle [] newArr = new Vehicle[vehicles.length + 1];
        for (int i = 0; i < vehicles.length; i++) {
            newArr[i] = vehicles[i];
        }
        newArr[vehicles.length] = vehicle;
        return newArr;
    }
}
