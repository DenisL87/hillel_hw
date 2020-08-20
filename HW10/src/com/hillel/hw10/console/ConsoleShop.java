package com.hillel.hw10.console;

import com.hillel.hw10.shop.*;
import com.hillel.hw10.exception.InvalidValueException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleShop {

    private FlowerShop flowerShop;
    private Scanner scan;
    private Flower[] flowers = new Flower[0];
    private Accessory[] accessories = new Accessory[0];

    public ConsoleShop (FlowerShop flowerShop){
        this.flowerShop = flowerShop;
        scan = new Scanner (System.in);
    }

    public static void main(String[] args) {
        FlowerShop shop = new FlowerShop();
        ConsoleShop cs = new ConsoleShop(shop);
        try {
            cs.start();
        }catch (InvalidValueException e){}
        cs.stop();
    }
    public void start() throws InvalidValueException {
        System.out.println("1. Create bunch" + "\n" +
                           "2. Bunch operations" + "\n" +
                           "3. Print current bunch" + "\n" +
                           "0. Exit");
        int select = scan.nextInt();
        switch (select){
            case 1:
                createBunch();
                break;
            case 2:
                bunchOperations();
                break;
            case 3:
                flowerShop.toString("current", new Flower[0]);
                break;
            case 0:
                return;
        }
        if (select > 3){
            InvalidValueException e = new InvalidValueException();
            start();
        }
    }
    public void createBunch() {
        System.out.println("1. Create flowers" + "\n" +
                           "2. Create accessories" + "\n" +
                           "0. Back");
        int select = scan.nextInt();
        switch (select){
            case 1:
                createFlowers();
                break;
            case 2:
                createAccessories();
                break;
            case 0:
                if (flowers.length != 0 && accessories.length != 0){
                    flowerShop.setFlowerShop(flowerShop.extendFlowerShopArr(flowerShop.getFlowerShop(), new FlowerShop(flowers, accessories)));
                }
                flowers = new Flower[0];
                accessories = new Accessory[0];
                try {
                    start();
                }catch (InvalidValueException e){}
                break;
        }
        if (select > 2){
            InvalidValueException e = new InvalidValueException();
            createBunch();
        }
    }

    public void createFlowers (){
        System.out.println("1. New flower" + "\n" + "0. Back");
        int select = scan.nextInt();
        switch(select) {
            case 1:
                System.out.println("Name");
                String name = scan.next();
                System.out.println("Price");
                double price = scan.nextDouble();
                System.out.println("Stem length");
                double stemLength = scan.nextDouble();
                System.out.println("Days to live");
                int daysToLive = scan.nextInt();
                flowers = flowerShop.extendFlowerArr(flowers, new Flower(name, price, stemLength, daysToLive));
                createFlowers();
                break;
            case 0:
                createBunch();
                break;
        }
        if (select > 1){
            InvalidValueException e = new InvalidValueException();
            createFlowers();
        }
    }

    public void createAccessories() {
        System.out.println("1. New accessory" + "\n" + "0. Back");
        int select = scan.nextInt();
        switch(select) {
            case 1:
                System.out.println("Name");
                String name = scan.next();
                System.out.println("Price");
                double price = scan.nextDouble();
                accessories = flowerShop.extendAccArr(accessories, new Accessory(name, price));
                createAccessories();
                break;
            case 0:
                createBunch();
                break;
        }
        if(select > 1) {
            InvalidValueException e = new InvalidValueException();
            createAccessories();
        }
    }

    public void bunchOperations(){
        System.out.println("1. Sort flowers by freshness" + "\n" +
                           "2. Flowers selection by stem length" + "\n" +
                           "3. Bunch price" + "\n" +
                           "4. Add flower" + "\n" +
                           "5. Add accessory" + "\n" +
                           "0. Back");
        int select = scan.nextInt();
        int bunchSelect;
        switch(select){
            case 1:
                if(flowerShop.getFlowerShop().length == 0) {
                    System.err.println("No bunches available");
                    bunchOperations();
                    break;
                }else {
                    flowerShop.toString("select", new Flower[0]);
                    bunchSelect = scan.nextInt();
                    if (bunchSelect > flowerShop.getFlowerShop().length) {
                        InvalidValueException e = new InvalidValueException();
                        bunchOperations();
                        break;
                    } else {
                        flowerShop.toString("sorted", flowerShop.sortByFreshness(flowerShop.getFlowerShop()[bunchSelect - 1].getFlowers()));
                        System.out.println("0. Back");
                        if (scan.nextInt() >= 0) {
                            bunchOperations();
                            break;
                        }
                    }
                }
                break;
            case 2:
                if(flowerShop.getFlowerShop().length == 0) {
                    System.err.println("No bunches available");
                    bunchOperations();
                    break;
                }else {
                    flowerShop.toString("select", new Flower[0]);
                    bunchSelect = scan.nextInt();
                    if (bunchSelect > flowerShop.getFlowerShop().length) {
                        InvalidValueException e = new InvalidValueException();
                        bunchOperations();
                        break;
                    } else {
                        System.out.println("Enter the minimum stem length");
                        double min = scan.nextInt();
                        if (min <= 0) {
                            InvalidValueException e = new InvalidValueException();
                            bunchOperations();
                            break;
                        }
                        System.out.println("Enter the maximum stem length");
                        double max = scan.nextInt();
                        if (max < min) {
                            InvalidValueException e = new InvalidValueException();
                            bunchOperations();
                            break;
                        }
                        flowerShop.toString("sorted", flowerShop.findStemLength(flowerShop.getFlowerShop()[bunchSelect - 1].getFlowers(), min, max));
                        System.out.println("O. Back");
                        if (scan.nextInt() >= 0) {
                            bunchOperations();
                            break;
                        }
                    }
                }
                break;
            case 3:
                if(flowerShop.getFlowerShop().length == 0) {
                    System.err.println("No bunches available");
                    bunchOperations();
                    break;
                }else {
                    flowerShop.toString("select", new Flower[0]);
                    bunchSelect = scan.nextInt();
                    if (bunchSelect > flowerShop.getFlowerShop().length) {
                        InvalidValueException e = new InvalidValueException();
                        bunchOperations();
                        break;
                    } else {
                        double price = flowerShop.bunchCostCalculate(flowerShop.getFlowerShop()[bunchSelect - 1].getFlowers(), flowerShop.getFlowerShop()[bunchSelect - 1].getAccessories());
                        System.out.println("Bunch price is " + price);
                        System.out.println("0. Back");
                        if (scan.nextInt() >= 0) {
                            bunchOperations();
                            break;
                        }
                    }
                }
                break;
            case 4:
                if(flowerShop.getFlowerShop().length == 0) {
                    System.err.println("No bunches available");
                    bunchOperations();
                    break;
                }else {
                    flowerShop.toString("select", new Flower[0]);
                    bunchSelect = scan.nextInt();
                    if (bunchSelect > flowerShop.getFlowerShop().length) {
                        InvalidValueException e = new InvalidValueException();
                        bunchOperations();
                        break;
                    } else {
                        System.out.println("Name");
                        String name = scan.next();
                        System.out.println("Price");
                        double price = scan.nextDouble();
                        System.out.println("Stem length");
                        double stemLength = scan.nextDouble();
                        System.out.println("Days to live");
                        int daysToLive = scan.nextInt();
                        flowerShop.getFlowerShop()[bunchSelect - 1].setFlowers(flowerShop.extendFlowerArr(flowerShop.getFlowerShop()[bunchSelect - 1].getFlowers(), new Flower(name, price, stemLength, daysToLive)));
                        flowerShop.sortArray(flowerShop.getFlowerShop(), bunchSelect - 1);
                        flowerShop.toString("current", new Flower[0]);
                    }
                }
                break;
            case 5:
                if(flowerShop.getFlowerShop().length == 0) {
                    System.err.println("No bunches available");
                    bunchOperations();
                    break;
                }else {
                    flowerShop.toString("select", new Flower[0]);
                    bunchSelect = scan.nextInt();
                    if (bunchSelect > flowerShop.getFlowerShop().length) {
                        InvalidValueException e = new InvalidValueException();
                        bunchOperations();
                        break;
                    } else {
                        System.out.println("Name");
                        String name = scan.next();
                        System.out.println("Price");
                        double price = scan.nextDouble();
                        flowerShop.getFlowerShop()[bunchSelect - 1].setAccessories(flowerShop.extendAccArr(flowerShop.getFlowerShop()[bunchSelect - 1].getAccessories(), new Accessory(name, price)));
                        flowerShop.sortArray(flowerShop.getFlowerShop(), bunchSelect - 1);
                        flowerShop.toString("current", new Flower[0]);
                    }
                }
                break;
            case 0:
                try {
                    start();
                }catch (InvalidValueException e){}
                break;
        }
        if (select > 5){
            InvalidValueException e = new InvalidValueException();
            bunchOperations();
        }
    }
    public void stop(){
        System.out.println("Good bye");
    }
}