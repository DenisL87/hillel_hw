package com.hillel.task12.run;

import com.hillel.task12.cars.*;
import com.hillel.task12.fleet.TaxiFleet;
import com.hillel.task12.util.Util;
import java.io.*;

public class Runner {
    public static void main (String[] args) throws IOException {
        Bus[] bus = new Bus[0];
        Util ut = new Util();
        TaxiFleet tf = new TaxiFleet();
        int i;
        char[] c = new char[0];
        String[] strings = new String[0];
        String charString = null;
        FileInputStream fis = new FileInputStream("Fleet.txt");
        do {
            i = fis.read();
            if ((char) i != ','){
                c = ut.extendArr(c, (char) i);
                charString = new String(c);
            }else {
                strings = ut.createString(strings, charString);
                c = new char[0];
            }
        }while (i != -1);
        //System.out.println(strings[5]);
        fis.close();
        //FileOutputStream fos = new FileOutputStream("Fleet.txt");
    }
}
