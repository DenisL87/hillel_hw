package com.hillel.task11.threads;

import com.hillel.task11.run.Run;
import com.hillel.task11.util.Util;

public class NewThread implements Runnable {
    public Thread t;
    Util ut = new Util();
    private static int number;
    public NewThread(int number) throws InterruptedException {
        new Thread(this, "Thread No. " + Integer.toString(number)).start();
        this.number = number;

    }
    @Override
    public void run() {
        synchronized (this) {
            while (Run.min <= Run.max) {
                ut.regNoDetermine(Run.min, getNumber());
                try {
                    Thread.currentThread().sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static int getNumber(){
        return number;
    }
}