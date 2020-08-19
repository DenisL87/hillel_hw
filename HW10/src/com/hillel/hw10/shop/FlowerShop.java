package com.hillel.hw10.shop;

import com.hillel.hw10.console.ConsoleShop;
import com.hillel.hw10.exception.InvalidValueException;
import java.util.Scanner;

public class FlowerShop {
    Scanner scan = new Scanner(System.in);
    private Flower[] flowers;
    private Accessory[] accessories;
    private FlowerShop[] flShop = new FlowerShop[0];

    public FlowerShop (Flower[] flowers, Accessory[] accessories){
        this.flowers = flowers;
        this.accessories = accessories;
    }
    public FlowerShop() {}

    public void addToBunchArr (FlowerShop fs){
        flShop = extendFlShArr(flShop, fs);
    }

    public void printBunch(String s) {
        if(s.equals("current")) {
            if (flShop.length < 1) {
                System.err.println("No bunches available");
                try {
                    ConsoleShop cs = new ConsoleShop(new FlowerShop());
                    cs.start();
                } catch (InvalidValueException e) {}
            } else {
                System.out.println("Flowers:");
                Flower[] f = flShop[flShop.length - 1].getFlowers();
                for (int i = 0; i < f.length; i++) {
                    System.out.println(f[i].getName() + " [price: " + f[i].getPrice() + ", stem length: " +
                            f[i].getStemLength() + ", days to live: " + f[i].getDaysToLive() + "]");
                }
                System.out.println("Accessories:");
                Accessory[] a = flShop[flShop.length - 1].getAccessories();
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i].getName() + " [price: " + a[i].getPrice() + "]");
                }
                System.out.println("Bunch cost: " + bunchCostCalculate(f, a));
                System.out.println("\n" + "Press any key to return to the main menu");
                var select = scan.next();
                if (select != null) {
                    try {
                        ConsoleShop cs = new ConsoleShop(new FlowerShop());
                        cs.start();
                    } catch (InvalidValueException e) {}
                }
            }
        }
        if(s.equals("select")) {
            System.out.println("Select bunch");
            for(int i = 0; i < flShop.length; i++) {
                System.out.println(i + 1 + "-->" + "\n" + "Flowers:");
                Flower[] f = flShop[i].getFlowers();
                for (int y = 0; y < f.length; y++) {
                    System.out.println(f[y].getName() + " [price: " + f[y].getPrice() + ", stem length: " +
                            f[y].getStemLength() + ", days to live: " + f[y].getDaysToLive() + "]");
                }
                Accessory[] a = flShop[i].getAccessories();
                System.out.println("Accessories:");
                for (int y = 0; y < a.length; y++){
                    System.out.println(a[y].getName() + " [price: " + a[y].getPrice() + "]");
                }
            }
            return;
        }
    }

    public void printFlowers(Flower[] f) {
        for(int i = 0; i < f.length; i++) {
            System.out.println(f[i].getName() + " [price: " + f[i].getPrice() + ", stem length: " +
                               f[i].getStemLength() + ", days to live: " + f[i].getDaysToLive() + "]");
        }

        return;
    }

    public FlowerShop[] extendFlShArr(FlowerShop[] fs, FlowerShop flSh){
        FlowerShop[] temp = new FlowerShop[fs.length + 1];
        for(int i = 0; i < fs.length; i++) {
            temp[i] = fs[i];
        }
        temp[fs.length] = flSh;
        return temp;
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
                    Flower temp = f[i];
                    f[i] = f[y];
                    f[y] = temp;
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

    public double bunchCostCalculate (Flower[] f, Accessory[] a) {
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

    public FlowerShop[] sortArray(FlowerShop[] fs, int pos) {
        FlowerShop temp = fs[fs.length - 1];
        fs[fs.length - 1] = fs[pos];
        fs[pos] = temp;
        return fs;
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

    public FlowerShop[] getFlowerShop(){
        return flShop;
    }
}