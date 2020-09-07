package com.hillel.task12.util;

import java.io.FileInputStream;
import java.io.IOException;

public class Util {

    public String createString (FileInputStream fis) throws IOException {
        byte[] fileBytes = new byte[fis.available()];
        fis.read(fileBytes);
        return new String (fileBytes);
    }
    
}
