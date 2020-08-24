package com.hillel.hw11.thread;

import com.hillel.hw11.taskeleven.HomeTaskEleven;
import com.hillel.hw11.utils.Util;

public class AThread implements Runnable {
    public Thread t;
    Util ut = new Util();
    int min = HomeTaskEleven.min;
    int max = HomeTaskEleven.max;
    public AThread(int number) throws InterruptedException {
        new Thread(this, "Thread No. " + Integer.toString(number)).start();

    }

    @Override
    public void run() {
        synchronized (ut) {
            do{

               ut.findRegularNumber(min);
               min++;
               //notifyAll();
            }while (min <= max);
        }
    }
}