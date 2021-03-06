package com.hillel.task11.threads;

import com.hillel.task11.run.Run;
import com.hillel.task11.util.Util;

public class NewThread implements Runnable {
    Util ut = new Util();
    private int number;
    public NewThread(int number) {
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

    public int getNumber(){
        return number;
    }
}