public class CarProcessor{
    Car[] vehicle = new Car[2];
    CarProcessor (Car[] newCar){
        for (int i = 0; i < newCar.length; i++) {
            vehicle[i] = newCar[i];
        }
    }
    CarProcessor(){
        Car[] newVehicle = new Car[vehicle.length];
        for (int i = 0; i < vehicle.length; i++) {
            vehicle[i] = newVehicle[i];
        }
    }

    public void findBrand (Car[] car, String carBrand) {
        for (int i = 0; i < car.length; i++) {
            if (car[i].brand.equals(carBrand)) {
                carPrint (car[i]);
            }
        }
    }
    public void findBrand (String carBrand) {
        if (vehicle != null) {
            for (int i = 0; i < vehicle.length; i++) {
                if (vehicle[i].brand.equals(carBrand)) {
                    carPrint(vehicle[i]);
                }
            }
        }
    }

    public void findProdYear (Car[] car, int yearOfProd, int carPrice) {
        for (int i = 0; i < car.length; i++) {
            if (car[i].prodYear == yearOfProd & car[i].price > carPrice) {
                carPrint (car[i]);
            }
        }
    }
    public void findProdYear (int yearOfProd, int carPrice) {
        if (vehicle != null) {
            for (int i = 0; i < vehicle.length; i++) {
                if (vehicle[i].prodYear == yearOfProd & vehicle[i].price > carPrice) {
                    carPrint(vehicle[i]);
                }
            }
        }
    }

    public void findModel (Car[] car, String carModel, int years) {
        for (int i = 0; i < car.length; i++) {
            if (car[i].model.equals(carModel) & 2020 - car[i].prodYear > years) {
                carPrint (car[i]);
            }
        }
    }
    public void findModel (String carModel, int years) {
        if (vehicle != null) {
            for (int i = 0; i < vehicle.length; i++){
                if (vehicle[i].model.equals(carModel) & vehicle[i].prodYear > years){
                    carPrint(vehicle[i]);
                }
            }
        }
    }

    public void carPrint (Car printCar) {
        System.out.println ("\nID: " + printCar.id);
        System.out.println ("Brand: " + printCar.brand);
        System.out.println ("Model: " + printCar.model);
        System.out.println ("Colour: " + printCar.colour);
        System.out.println ("Year of manufacture: " + printCar.prodYear);
        System.out.println ("Price: " + printCar.price);
        System.out.println ("Registration No.: " + printCar.regNo);
    }
}