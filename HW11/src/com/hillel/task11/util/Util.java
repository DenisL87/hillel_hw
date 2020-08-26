package com.hillel.task11.util;

import com.hillel.task11.run.Run;

public class Util {
    int arr[][] = new int[0][Run.noOfThreads];

    public synchronized void regNoDetermine (int value, int threadNumber){
        if (value <= Run.max){
            Run.min++;
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
                //System.out.println(Thread.currentThread().getName() + "    Value: " + value);
                arr[threadNumber] = addToArr(arr[threadNumber], value);
            }
        }
    }
    private int[] addToArr (int[] arr, int value){
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        return newArr;
    }
    public int[] totalArr (int[][] tempArrs){
        int[] totalArr = new int[0];
        int totalArrCount = 0;
        for (int i = 0; i < Run.noOfThreads; i++){
            totalArr = new int[totalArr.length + tempArrs[i].length];
        }

        for (int i = 0; i < tempArrs.length; i++){
            for (int y = 0; y < tempArrs[i].length;y++){
                totalArr[totalArrCount] = tempArrs[y][i];
                totalArrCount++;
            }
        }
        return totalArr;
    }

    public int[][] getArr (){
        return arr;
    }
}
