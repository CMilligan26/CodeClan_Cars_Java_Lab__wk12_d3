package DealershipStuff;

import CarStuff.Car;

import java.util.ArrayList;
import java.util.BitSet;

public class Customer {

    private int funds;
    private ArrayList<Car> ownedCars;

    public Customer(int funds){
        this.funds = funds;
        this.ownedCars = new ArrayList<Car>();
    }

    public int getFunds() {
        return this.funds;
    }

    public ArrayList<Car> getOwnedCars() {
        return this.ownedCars;
    }

    public void buyCar(Car car) {
        if (this.canBuyCar(car) == true) {
            this.funds -= car.getPrice();
            this.ownedCars.add(car);
        }
    }

    public boolean canBuyCar(Car car) {
        return this.funds >= car.getPrice();
    }

    public Car sellCar(Car car) {
            this.funds += car.getPrice();
            this.ownedCars.remove(car);
            return car;
    }
}
