package com.hillel.task14.util;

import com.hillel.task14.cars.Vehicle;
import java.util.Comparator;


public class ComparatorImpl implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return (int) (o1.getFuelConsumption() - o2.getFuelConsumption());
    }
}
