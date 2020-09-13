package com.hillel.task14.util;

import com.hillel.task14.cars.Vehicle;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Util {

    public String createString (FileInputStream fis) throws IOException {
        byte[] fileBytes = new byte[fis.available()];
        fis.read(fileBytes);
        return new String (fileBytes);
    }

    public Vehicle[] compareVehicles (Compare comp, Vehicle[] vehicles){
        return comp.compare(vehicles);
    }

    public static Vehicle[] sorting(Vehicle[] v){
        ComparatorImpl compI = new ComparatorImpl();
        Arrays.sort(v, compI);
        return v;
    }

}
