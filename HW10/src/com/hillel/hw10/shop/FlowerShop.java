package com.hillel.hw10.shop;

import com.hillel.hw10.console.ConsoleShop;
import java.util.Scanner;

public class FlowerShop {
    Scanner scan = new Scanner(System.in);
    Flower[] bunch = new Flower[0];

    public void addToBunch (Flower f){
        bunch = extendArr(bunch);
        bunch[bunch.length - 1] = f;
        System.out.println(bunch.length + f.getName());
    }
    public void printBunch() {
        if(bunch == null){
            ConsoleShop shop = new ConsoleShop(new FlowerShop());
            shop.start();
        }else{
            for(int i = 0; i < bunch.length; i++) {
                System.out.println("Flower: " + bunch[i].getName() + "\n" +
                                   "price" + bunch[i].getPrice() + "\n" +
                                   "stem length" + bunch[i].getStemLength() + "\n" +
                                   "days to live: " + bunch[i].getDaysToLive() + "\n");
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
    private Flower[] extendArr(Flower[] f){
        Flower[] temp = new Flower[f.length + 1];
        for (int i = 0; i < f.length; i++){
            temp[i] = f[i];
        }
        return temp;
    }
    public Flower[] sortByFreshness(Flower[] f) {
        for (int i = 0; i < f.length; i++){
            for (int y = i; y < f.length; i++){
                if (f[y].getDaysToLive() < f[i].getDaysToLive()){
                    int temp = f[i].getDaysToLive();
                    f[i].setDaysToLive(f[y].getDaysToLive());
                    f[y].setDaysToLive(temp);
                }
            }
        }
        return f;
    }
    public Flower[] findStemLength (Flower[] f, double min, double max){
        return null;
    }
}