package DealershipStuff;

import CarStuff.Car;

public class Dealer {

    public Dealer(){

    }

    public boolean sellCar(Customer customer, Till till, Car car) {
        if ( customer.canBuyCar(car) ) {
            customer.buyCar(car);
            till.addMoney(car.getPrice());
            return true;
        }
        return false;
    }

    public boolean buyCar(Till till, Car car) {
        if (this.canBuyCar(car, till) ) {
            till.removeMoney(car.getPrice());
            return true;
        }
        return false;
    }

    private boolean canBuyCar(Car car, Till till) {
        return till.getMoney() >= car.getPrice();
    }
}
