package com.hillel.hw10.shop;

import com.hillel.hw10.console.ConsoleShop;
import com.hillel.hw10.exception.InvalidValueException;
import java.util.Scanner;

public class FlowerShop {
    Scanner scan = new Scanner(System.in);

    private Flower[] flowers;
    private Accessory[] accessories;

    public void printBunch(Flower[] f, Accessory[] a) {
        if (f == null){
            System.out.println("No flowers available");
        }else {
            System.out.println("Flowers:");
            for (int i = 0; i < f.length; i++) {
                System.out.println(f[i].getName() + ": [price = " + f[i].getPrice() +
                                   ", stem length = " + f[i].getStemLength() +
                                   ", days to live = " + f[i].getDaysToLive() + "]");
            }
        }
        if (a  == null){
            System.out.println("No accessories available");
        }else {
            System.out.println("Accessories:");
            for (int i = 0; i < a.length; i++){
                System.out.println(a[i].getName() + ": [price = " + a[i].getPrice() + "]");
            }
        }
        if (f.length > 0 || a.length > 0){
            System.out.println("Bunch cost: " + bunchCostCalculate(f, a));
        }
        System.out.println("\n" + "0. Back");
        switch (scan.nextInt()){
            case 0:
                ConsoleShop shop = new ConsoleShop(new FlowerShop());
                try {
                    shop.start();
                }catch (InvalidValueException e){}
                break;
        }
    }

    public Flower[] extendFlowerArr(Flower[] f, Flower fl){
        Flower[] temp = new Flower[f.length + 1];
        for (int i = 0; i < f.length; i++){
            temp[i] = f[i];
        }
        temp[f.length] = fl;
        return temp;
    }

    public Accessory[] extendAccArr(Accessory[] a, Accessory acc){
        Accessory[] temp = new Accessory[a.length + 1];
        for (int i = 0; i < a.length; i++){
            temp[i] = a[i];
        }
        temp[a.length] = acc;
        return temp;
    }

    public Flower[] sortByFreshness(Flower[] f) {
        for (int i = 0; i < f.length; i++){
            for (int y = i; y < f.length; y++){
                if (f[y].getDaysToLive() > f[i].getDaysToLive()){
                    int temp = f[i].getDaysToLive();
                    f[i].setDaysToLive(f[y].getDaysToLive());
                    f[y].setDaysToLive(temp);
                }
            }
        }
        return f;
    }

    public Flower[] findStemLength (Flower[] f, double min, double max){
        Flower[] flowers = new Flower[0];
        for (int i = 0; i < f.length; i++){
            if (f[i].getStemLength() >= min && f[i].getStemLength() <= max){
                flowers = extendFlowerArr(flowers, f[i]);
            }
        }
        return flowers;
    }

    private double bunchCostCalculate (Flower[] f, Accessory[] a){
        double costF = 0;
        double costA = 0;
        for (int i = 0; i < f.length; i++){
            costF += f[i].getPrice();
        }
        for (int i = 0; i < a.length; i++){
            costA += a[i].getPrice();
        }
        return costA + costF;
    }

    public void setFlowers (Flower[] flowers){
        this.flowers = flowers;
    }
    public void setAccessories (Accessory[] accessories){
        this.accessories = accessories;
    }
    public Flower[] getFlowers() {
        return flowers;
    }
    public Accessory[] getAccessories() {
        return accessories;
    }
}