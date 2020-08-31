package com.hillel.task12.util;

public class Util {
    public char[] extendArr (char[] arr, char el){
        char[] temp = new char[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        temp[arr.length] = el;
        return temp;
    }
    public String[] createString (String[] arr, String el){
        String[] temp = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        temp[arr.length] = el;
        return temp;
    }
}
