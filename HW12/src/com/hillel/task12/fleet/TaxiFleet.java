package com.hillel.task12.fleet;

import com.hillel.task12.cars.*;

public class TaxiFleet {

    private Vehicle[] vehicle;
    public TaxiFleet (Vehicle[] vehicle){
        this.vehicle = vehicle;
    }
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

    public Vehicle[] sortByFuelConsumption (Vehicle[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int y = i + 1; y < v.length; y++) {
                if (v[i].getFuelConsumption() > v[y].getFuelConsumption()) {
                    Vehicle temp = v[i];
                    v[i] = v[y];
                    v[y] = temp;
                }
            }
        }
        return v;
    }

    public Vehicle[] extendArr(Vehicle[] vehicles, Vehicle vehicle){
        Vehicle [] newArr = new Vehicle[vehicles.length + 1];
        for (int i = 0; i < vehicles.length; i++) {
            newArr[i] = vehicles[i];
        }
        newArr[vehicles.length] = vehicle;
        return newArr;
    }

    public Bus[] extendArr(Bus[] vehicles, Bus vehicle){
        Bus [] newArr = new Bus[vehicles.length + 1];
        for (int i = 0; i < vehicles.length; i++) {
            newArr[i] = vehicles[i];
        }
        newArr[vehicles.length] = vehicle;
        return newArr;
    }

    public Lorry[] extendArr(Lorry[] vehicles, Lorry vehicle){
        Lorry [] newArr = new Lorry[vehicles.length + 1];
        for (int i = 0; i < vehicles.length; i++) {
            newArr[i] = vehicles[i];
        }
        newArr[vehicles.length] = vehicle;
        return newArr;
    }

    public LightVehicle[] extendArr(LightVehicle[] vehicles, LightVehicle vehicle){
        LightVehicle [] newArr = new LightVehicle[vehicles.length + 1];
        for (int i = 0; i < vehicles.length; i++) {
            newArr[i] = vehicles[i];
        }
        newArr[vehicles.length] = vehicle;
        return newArr;
    }
}
