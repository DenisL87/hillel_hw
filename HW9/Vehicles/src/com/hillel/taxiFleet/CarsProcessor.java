package com.hillel.taxiFleet;
import com.hillel.cars.*;

public interface CarsProcessor {
    Car[] sortByFuelConsumption (Car[] car);
    Car[] findSpeed (Car[] car, int min, int max);
    int fleetCost (Car[] car);
}
