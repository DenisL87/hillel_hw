package com.hillel.hw10.console;

import com.hillel.hw10.shop.*;
import com.hillel.hw10.exception.InvalidValueException;
import java.util.Scanner;

public class ConsoleShop {

    private FlowerShop flowerShop;
    private Scanner scan;
    Flower[] flower = new Flower[0];
    Accessory[] accessory = new Accessory[0];

    public ConsoleShop (FlowerShop flowerShop){
        this.flowerShop = flowerShop;
        scan = new Scanner (System.in);
    }

    public static void main (String[] args){
        FlowerShop shop = new FlowerShop();
        ConsoleShop cs = new ConsoleShop(shop);
        cs.start();
    }
    public void start(){
        System.out.println("1. Create bunch" + "\n" +
                           "2. Bunch operations" + "\n" +
                           "3. Print current bunch" + "\n" +
                           "0. Exit");
        switch (scan.nextInt()){
            case 1:
                secondDialog();
                break;
            case 2:
                bunchOperations();
                break;
            case 3:
                flowerShop.printBunch(flower);
                break;
            case 0:
                stop();
                break;
        }
    }
    public void secondDialog (){
        System.out.println("1. Create flowers" + "\n" +
                           "2. Create accessories" + "\n" +
                           "0. Back");
        switch (scan.nextInt()){
            case 1:
                thirdDialog();
                break;
            case 2:
                thirdDialog();
                break;
            case 0:
                start();
                break;
        }
    }
    public void thirdDialog (){
        System.out.println("1. New flower" + "\n" +
                           "2. New accessory" + "\n" +
                           "0. Back");
        String name;
        double price;
        double stemLength;
        int daysToLive;
        switch (scan.nextInt()){
            case 1:
                System.out.println("Name");
                name = scan.next();
                System.out.println("Price");
                price = scan.nextDouble();
                System.out.println("Stem length");
                stemLength = scan.nextDouble();
                System.out.println("Days to live");
                daysToLive = scan.nextInt();
                flower = flowerShop.extendArr(flower, new Flower(name, price, stemLength, daysToLive));
                thirdDialog();
                break;
            case 2:
                System.out.println("Name");
                name = scan.next();
                System.out.println("Price");
                price = scan.nextDouble();

                thirdDialog();
                break;
            case 0:
                secondDialog();
                break;
        }
    }
    public void bunchOperations(){
        System.out.println("1. Sort by freshness" + "\n" +
                           "2. Selection by stem length" + "\n" +
                           "0. Back");
        switch(scan.nextInt()){
            case 1:
                flowerShop.sortByFreshness(flower);
                break;
            case 2:
                    flowerShop.findStemLength(flower, 5.6, 25.2);
                break;
            case 0:
                start();
                break;
        }
    }
    public void stop(){
        System.out.println("Good bye");
    }
}
