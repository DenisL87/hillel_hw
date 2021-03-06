public class TaxiFleet {

    private Car[] car;
    public TaxiFleet (Car[] car){
        this.car = car;
    }

    int fleetCost (){
        int cost = 0;
        for (Car newCar : car){
            cost += newCar.price;

        }
        return cost;
    }
    Car[] findSpeed (int min, int max) {
        Car[] newArr = new Car[0];
        for (Car cars : car) {
            if (cars.speed < max && cars.speed > min) {
                newArr = extendArr(newArr, cars);
            }
        }
        return newArr;
    }

    Car[] sortByFuelConsumption () {
        for (int i = 0; i < car.length; i++) {
            for (int y = i + 1; y < car.length; y++) {
                if (car[i].fuelConsumption > car[y].fuelConsumption) {
                    Car temp = car[i];
                    car[i] = car[y];
                    car[y] = temp;
                }
            }
        }
        return car;
    }

    Car[] extendArr(Car[] cars, Car car){
        Car [] newArr = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            newArr[i] = cars[i];
        }
        newArr[cars.length] = car;
        return newArr;
    }
}
