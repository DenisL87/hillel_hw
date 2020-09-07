package com.hillel.task12.run;

import com.hillel.task12.cars.*;
import com.hillel.task12.fleet.TaxiFleet;
import com.hillel.task12.util.Util;
import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        Bus[] bus = new Bus[0];
        Lorry[] lorry = new Lorry[0];
        LightVehicle[] lv = new LightVehicle[0];
        FileInputStream fis = new FileInputStream("Fleet.txt");
        Util ut = new Util();
        TaxiFleet tf = new TaxiFleet();
        String s = ut.createString(fis);
        String[] lines = s.split(";");
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].trim();
        }
        for (int i = 0; i < lines.length; i++) {
            String[] prop = lines[i].split(",");
            switch (prop[0]) {
                case "bus":
                    bus = tf.extendArr(bus, new Bus(prop[1].trim(), prop[2].trim(), Integer.parseInt(prop[3].trim()),
                            Integer.parseInt(prop[4].trim()), Double.parseDouble(prop[5].trim()), Integer.parseInt(prop[6].trim())));
                    break;
                case "lorry":
                    lorry = tf.extendArr(lorry, new Lorry(prop[1].trim(), prop[2].trim(), Integer.parseInt(prop[3].trim()), Integer.parseInt(prop[4].trim()),
                            Double.parseDouble(prop[5].trim()), Double.parseDouble(prop[6].trim())));
                    break;
                case "light vehicle":
                    lv = tf.extendArr(lv, new LightVehicle(prop[1].trim(), prop[2].trim(), Integer.parseInt(prop[3].trim()),
                            Integer.parseInt(prop[4].trim()), Double.parseDouble(prop[5].trim())));

            }
        }
        fis.close();
        tf.sortByFuelConsumption(bus);
        FileOutputStream fos = new FileOutputStream("Fleet2.txt");
        String joinProperties;
        for (int i = 0; i < bus.length; i++){
            joinProperties = "bus: " + bus[i].getBrand() + ", " + bus[i].getModel() + ", " + Integer.toString(bus[i].getPrice()) + ", " +
                    Integer.toString(bus[i].getSpeed()) + ", " + Double.toString(bus[i].getFuelConsumption()) + ", " + Integer.toString(bus[i].getNoOfSeats())  + ";\n";
            fos.write(joinProperties.getBytes());
        }
        for (int i = 0; i < lorry.length; i++){
            joinProperties = "lorry: " + lorry[i].getBrand() + ", " + lorry[i].getModel() + ", " + Integer.toString(lorry[i].getPrice()) + ", " +
                    Integer.toString(lorry[i].getSpeed()) + ", " + Double.toString(lorry[i].getFuelConsumption()) + ", " + Double.toString(lorry[i].getCarryingCapacity())  + ";\n";
            fos.write(joinProperties.getBytes());
        }
        for (int i = 0; i < lv.length; i++){
            joinProperties = "light vehicle: " + lv[i].getBrand() + ", " + lv[i].getModel() + ", " + Integer.toString(lv[i].getPrice()) + ", " +
                    Integer.toString(lv[i].getSpeed()) + ", " + Double.toString(lv[i].getFuelConsumption()) + ";\n";
            fos.write(joinProperties.getBytes());
        }
    }
}