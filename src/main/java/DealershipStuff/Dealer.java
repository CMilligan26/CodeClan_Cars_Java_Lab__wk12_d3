package DealershipStuff;

import CarStuff.Car;

public class Dealer {

    public Dealer(){

    }

    public boolean sellCar(Customer customer, Till till, Car car) {
        if (customer.canBuyCar(car) == true) {
            customer.buyCar(car);
            till.addMoney(car.getPrice());
            return true;
        }
        return false;
    }
}
