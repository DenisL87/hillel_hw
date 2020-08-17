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
        try {
            cs.start();
        }catch (InvalidValueException e){}
        cs.stop();
    }
    public void start() throws InvalidValueException{
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
                /*if (flower.length > 0 || accessory.length > 0) {
                    flowerShop.printBunch(flower, accessory);
                }else {
                    System.err.println("No bunches available");
                    try {
                        start();
                    }catch(InvalidValueException e){}
                }*/
                if (flowerShop.getFlowers() == null && flowerShop.getAccessories() == null){
                    System.err.println("No bunches available");
                    try {
                        start();
                    }catch(InvalidValueException e){}
                }else if (flowerShop.getFlowers() != null && flowerShop.getAccessories() == null){
                    flowerShop.printBunch(flowerShop.getFlowers(), new Accessory[0]);
                }else if (flowerShop.getFlowers() == null && flowerShop.getAccessories() != null){
                    flowerShop.printBunch(new Flower[0], flowerShop.getAccessories());
                }else {
                    flowerShop.printBunch(flowerShop.getFlowers(), flowerShop.getAccessories());
                }
                break;
            case 0:
                return;
        }
    }
    public void secondDialog () {
        System.out.println("1. Add flower" + "\n" +
                           "2. Add accessory" + "\n" +
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
                    if (stemLength < 0){
                        InvalidValueException e = new InvalidValueException();
                        secondDialog();
                    }
                System.out.println("Days to live");
                daysToLive = scan.nextInt();
                flower = flowerShop.extendFlowerArr(flower, new Flower(name, price, stemLength, daysToLive));
                flowerShop.setFlowers(flower);
                secondDialog();
                break;
            case 2:
                System.out.println("Name");
                name = scan.next();
                System.out.println("Price");
                price = scan.nextDouble();
                accessory = flowerShop.extendAccArr(accessory, new Accessory(name, price));
                flowerShop.setAccessories(accessory);
                secondDialog();
                break;
            case 0:
                try {
                    start();
                }catch (InvalidValueException e){}
                break;
        }
    }

    public void bunchOperations(){
        System.out.println("1. Sort by freshness" + "\n" +
                           "2. Selection by stem length" + "\n" +
                           "0. Back");
        switch(scan.nextInt()){
            case 1:
                if (flowerShop.getFlowers() == null) {
                    System.err.println("No bunches available");
                    bunchOperations();
                }else {
                    flowerShop.printBunch(flowerShop.sortByFreshness(flowerShop.getFlowers()), new Accessory[0]);
                }
                break;
            case 2:
                if (flowerShop.getFlowers() == null) {
                    System.err.println("No bunches available");
                    bunchOperations();
                }else {
                    int min;
                    int max;
                    System.out.println("Enter the minimum stem length");
                    min = scan.nextInt();
                    System.out.println("Enter the maximum stem length");
                    max = scan.nextInt();
                    flowerShop.printBunch(flowerShop.findStemLength(flowerShop.getFlowers(), min, max), new Accessory[0]);
                }
                break;
            case 0:
                try {
                    start();
                }catch (InvalidValueException e){}
                break;
        }
    }
    public void stop(){
        System.out.println("Good bye");
    }
}