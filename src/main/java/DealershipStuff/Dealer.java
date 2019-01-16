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

    public boolean buyCar(Customer customer, Till till) {
        Car carToBuy = customer.getOwnedCars().get(0);
        if (this.canBuyCar(carToBuy, till) ) {
            till.removeMoney(carToBuy.getPrice());
            return true;
        }
        return false;
    }

    private boolean canBuyCar(Car car, Till till) {
        return till.getMoney() >= car.getPrice();
    }
}
