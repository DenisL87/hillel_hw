public abstract class Car {
    int price;
    int speed;
    int fuelConsumption;
    String brand;
    String model;

    Car (String brand, String model, int price, int speed, int fuelConsumption){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
    }

    void toString (Car[] cars){

    }

    public String getBrand(){
        return brand;
    }
    public void setBrand (String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getPrice (){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public int getSpeed (){
        return speed;
    }
    public void setSpeed (int speed){
        this.speed = speed;
    }

    public int getFuelConsumption (){
        return fuelConsumption;
    }
    public void setFuelConsumption (int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }
}
