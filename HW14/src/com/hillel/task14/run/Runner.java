package com.hillel.task14.run;

import com.hillel.task14.cars.*;
import com.hillel.task14.fleet.TaxiFleet;
import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        Bus[] bus = new Bus[3];
        bus[0] = new Bus("Tata", "asdsd", 45000, 150, 60, 80);
        bus[1] = new Bus("Man", "sdgS", 75000, 150, 46, 80);
        bus[2] = new Bus("Volvo", "5446", 35000, 150, 45, 80);
        TaxiFleet tf = new TaxiFleet();
        tf.sortByFuelConsumption(bus);

        Lorry[] lorry = new Lorry[3];
        lorry[0] = new Lorry("KRAZ", "asdsd", 45000, 150, 60, 80);
        lorry[1] = new Lorry("MAZ", "sdgS", 75000, 150, 46, 80);
        lorry[2] = new Lorry("KAMAZ", "5446", 35000, 150, 45, 80);
        tf.sortByFuelConsumptionLambda(lorry);

        LightVehicle[] lv = new LightVehicle[3];
        lv[0] = new LightVehicle("Kia", "Cerato", 50000, 200, 10);
        lv[1] = new LightVehicle("Toyota", "Prius", 50000, 200, 7);
        lv[2] = new LightVehicle("Seat", "Ibiza", 5000, 200, 9);
        tf.sortByFuelConsumptionByMethodReference(lv);
        for (int i = 0; i < lv.length; i++){
            System.out.println(lv[i].getBrand());
        }
    }
}