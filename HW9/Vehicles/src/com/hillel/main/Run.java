package com.hillel.main;

import com.hillel.cars.*;
import com.hillel.taxiFleet.*;

public class Run {
    public static void main (String[] args){
        Bus[] bus = new Bus[3];
        bus[0] = new Bus("Man", "Temsa", 10000, 100, 19);
        bus[1] = new Bus("Setra", "S419 GT-HD", 30000, 110, 22);
        bus[2] = new Bus("Volvo", "9900", 40000, 120, 15);

        Lorry[] lorry = new Lorry[2];
        lorry[0] = new Lorry("Scania", "R 124 LB", 30000, 150, 21.3);
        lorry[1] = new Lorry("Iveco", "ML 75E", 35000, 150, 21.4);

        TaxiFleet tf = new TaxiFleet();
        tf.findSpeed(bus, 105, 150);
    }
}