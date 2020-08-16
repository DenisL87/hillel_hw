package com.hillel.hw10.shop;

import com.hillel.hw10.console.ConsoleShop;
import java.util.Scanner;

public class FlowerShop {
    Scanner scan = new Scanner(System.in);

    public void printBunch(Flower[] bunch) {
        if(bunch == null){
            ConsoleShop shop = new ConsoleShop(new FlowerShop());
            shop.start();
        }else{
            for(int i = 0; i < bunch.length; i++) {
                System.out.println("Flower: " + bunch[i].getName() + "\n" +
                                   "Price: " + bunch[i].getPrice() + "\n" +
                                   "Stem length: " + bunch[i].getStemLength() + "\n" +
                                   "Days to live: " + bunch[i].getDaysToLive() + "\n");
            }
        }
        System.out.println("0. Back");
        switch (scan.nextInt()){
            case 0:
                ConsoleShop shop = new ConsoleShop(new FlowerShop());
                shop.start();
                break;
        }
    }
    public Flower[] extendArr(Flower[] f, Flower fl){
        Flower[] temp = new Flower[f.length + 1];
        for (int i = 0; i < f.length; i++){
            temp[i] = f[i];
        }
        temp[f.length] = fl;
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
        printBunch(f);
        ConsoleShop shop = new ConsoleShop(new FlowerShop());
        shop.bunchOperations();
        return f;
    }
    public Flower[] findStemLength (Flower[] f, double min, double max){
        for (int i = 0; i < f.length; i++){
            if (f[i].getStemLength() >= min && f[i].getStemLength() <= max){
                Flower[] flowers = new Flower[1];
                flowers[0] = f[i];
                printBunch(flowers);
            }
        }
        ConsoleShop shop = new ConsoleShop(new FlowerShop());
        shop.bunchOperations();
        return f;
    }
}