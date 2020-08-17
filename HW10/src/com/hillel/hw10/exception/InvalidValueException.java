package com.hillel.hw10.exception;

public class InvalidValueException extends Exception {

    public InvalidValueException(){
        printException();
    }
    public void printException() {
        System.err.println("Invalid value");
    }
}