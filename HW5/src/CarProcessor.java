public class CarProcessor{

    public void findBrand (Car[] car, String carBrand) {
        for (int i = 0; i < car.length; i++) {
            if (car[i].brand.equals(carBrand)) {
                carPrint (car[i]);
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

    public void findModel (Car[] car, String carModel, int years) {
        for (int i = 0; i < car.length; i++) {
            if (car[i].model.equals(carModel) & 2020 - car[i].prodYear > years) {
                carPrint (car[i]);
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