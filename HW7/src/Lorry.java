public class Lorry extends Car {
    Lorry(String brand, String model, int price, int speed, int fuelConsumption) {
        super(brand, model, price, speed, fuelConsumption);
    }

    void toString (Car[] car){
        for (Car cars : car){
            System.out.println(cars.brand);
            System.out.println(cars.model);
            System.out.println(cars.price);
            System.out.println(cars.speed);
            System.out.println(cars.fuelConsumption);
        }
    }
}
