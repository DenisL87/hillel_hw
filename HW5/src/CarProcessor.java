public class CarProcessor {

    public void printBrand (Car[] car, String carBrand) {
        int carCount = 1;
        System.out.println ("\n" + carBrand + " brand vehicles:");
        for (int i = 0; i < car.length; i++) {
            if (car[i].brand == carBrand) {
                System.out.println (carCount + ":");
                System.out.println ("ID: " + car[i].id);
                System.out.println ("Brand: " + car[i].brand);
                System.out.println ("Model: " + car[i].model);
                System.out.println ("Colour: " + car[i].colour);
                System.out.println ("Year of manufacture: " + car[i].prodYear);
                System.out.println ("Price: " + car[i].price);
                System.out.println ("Registration No. : " + car[i].regNo);
                carCount++;
            }
        }
    }

    public void printProdYear (Car[] car, int yearOfProd, int carPrice) {
        int carCount = 1;
        System.out.println ("\n" + yearOfProd + " year of manufacture vehicles, which price exceeds " + carPrice);
        for (int i = 0; i < car.length; i++) {
            if (car[i].prodYear == yearOfProd & car[i].price > carPrice) {
                System.out.println (carCount + ":");
                System.out.println ("ID: " + car[i].id);
                System.out.println ("Brand: " + car[i].brand);
                System.out.println ("Model: " + car[i].model);
                System.out.println ("Colour: " + car[i].colour);
                System.out.println ("Year of manufacture: " + car[i].prodYear);
                System.out.println ("Price: " + car[i].price);
                System.out.println ("Registration No. : " + car[i].regNo);
                carCount++;
            }
        }
    }

    public void printModel (Car[] car, String carModel, int years) {
        int carCount = 1;
        System.out.println ("\n" + carModel + " model vehicles, which have been used for more than " + years + " years");
        for (int i = 0; i < car.length; i++) {
            if (car[i].model == carModel & 2020 - car[i].prodYear > years) {
                System.out.println (carCount + ":");
                System.out.println ("ID: " + car[i].id);
                System.out.println ("Brand: " + car[i].brand);
                System.out.println ("Model: " + car[i].model);
                System.out.println ("Colour: " + car[i].colour);
                System.out.println ("Year of manufacture: " + car[i].prodYear);
                System.out.println ("Price: " + car[i].price);
                System.out.println ("Registration No. : " + car[i].regNo);
                carCount++;
            }
        }
    }

}