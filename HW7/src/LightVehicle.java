public class LightVehicle extends Car {
    LightVehicle(String brand, String model, int price, int speed, int fuelConsumption) {
        super(brand, model, price, speed, fuelConsumption);
    }
    void toString (LightVehicle[] lv){
        for (LightVehicle lVeh : lv){
            System.out.println(lVeh.brand);
            System.out.println(lVeh.model);
            System.out.println(lVeh.price);
            System.out.println(lVeh.speed);
            System.out.println(lVeh.fuelConsumption);
        }
    }
}