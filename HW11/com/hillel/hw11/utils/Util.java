package com.hillel.hw11.utils;

import com.hillel.hw11.taskeleven.HomeTaskEleven;

public class Util {

    public void findRegularNumber(int value) /*throws InterruptedException*/ {
        if (value <= HomeTaskEleven.max){
            int number = 0;
            int divider = 2;
            while (divider < value) {
                number = value % divider;
                if (number == 0) {
                    divider = value;
                }
                divider++;
            }
            if (number != 0 || value == 2) {
                System.out.println(Thread.currentThread().getName() + "    Value: " + value);
            }
        }
        //this.notifyAll();
    }
}