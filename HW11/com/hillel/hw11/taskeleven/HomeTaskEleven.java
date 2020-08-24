package com.hillel.hw11.taskeleven;

import com.hillel.hw11.thread.AThread;
import com.hillel.hw11.utils.Util;
import java.util.Scanner;

public class HomeTaskEleven {
    public static int min;
    public static int max;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Number of threads");
        AThread[] aT = new AThread[scan.nextInt()];
        System.out.println("Set the minimum value");
        min = scan.nextInt();
        System.out.println("Set the maximum value");
        max = scan.nextInt();

            for (int i = 0; i < aT.length; i++) {
                aT[i] = new AThread(i + 1);
            }
        scan.close();
    }
}