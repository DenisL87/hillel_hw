public class Lorry extends Car {
    Lorry(String brand, String model, int price, int speed, int fuelConsumption) {
        super(brand, model, price, speed, fuelConsumption);
    }
    
   void toString (Lorry[] l){
        for (Lorry lor : l){
            System.out.println(lor.brand);
            System.out.println(lor.model);
            System.out.println(lor.price);
            System.out.println(lor.speed);
            System.out.println(lor.fuelConsumption);
        }
    }
}
