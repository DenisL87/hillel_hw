public class Van extends Car {
    Van(String brand, String model, int price, int speed, int fuelConsumption) {
        super(brand, model, price, speed, fuelConsumption);
    }
    void toString (Van[] v){
        for (Van van : v){
            System.out.println(van.brand);
            System.out.println(van.model);
            System.out.println(van.price);
            System.out.println(van.speed);
            System.out.println(van.fuelConsumption);
        }
    }
}
