public class Runner {
    public static void main (String[] args) {
        Car[] newCar = new Car[7];
        newCar [0] = new Car (1, 2010, 7000, 1818, "Fiat", "Doblo", "white");
        newCar [1] = new Car (2, 2012, 12000, 4465, "Honda", "Civic", "red");
        newCar [2] = new Car (3, 2015, 32000, 2398, "BMW", "x5", "black");
        newCar [3] = new Car (4, 2018, 20000, 1502, "Ford", "Mondeo", "grey");
        newCar [4] = new Car (4, 2013, 20000, 1982, "Ford", "Mondeo", "grey");
        newCar [5] = new Car (5, 2019, 19500, 6599, "Peugeot", "308", "silver");
        newCar [6] = new Car (5, 2019, 19500, 7399, "Peugeot", "307", "yellow");
        int operPeriodToCompare = 5;
        int priceToCompare = 10000;
        int prodYearSpec = 2019;
        String brandSpec = "Peugeot";
        String modelSpec = "Mondeo";
        CarProcessor cp = new CarProcessor();

        cp.findBrand(newCar, brandSpec);
        cp.findModel(newCar, modelSpec, operPeriodToCompare);
        cp.findProdYear(newCar, prodYearSpec, priceToCompare);

    }
}