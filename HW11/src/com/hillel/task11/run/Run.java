package com.hillel.task11.run;

import com.hillel.task11.threads.NewThread;
import com.hillel.task11.util.Util;

import java.util.Scanner;

public class Run {
    public static NewThread[] nt;
    public static int min;
    public static int max;
    public static int noOfThreads;

    public static void main (String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Set the min value");
        min = scan.nextInt();
        System.out.println("Set the max value");
        max = scan.nextInt();
        System.out.println("No. of threads");
        noOfThreads = scan.nextInt();
        nt = new NewThread[noOfThreads];

        for (int i = 0; i < noOfThreads; i++) {
            nt[i] = new NewThread(i);
        }

        Util ut = new Util();
        for (int i = 0; i < ut.totalArr(ut.getArr()).length; i++){
            System.out.print(ut.totalArr(ut.getArr())[i] + " ");
        }
        scan.close();
    }
}
