package DealershipStuff;

import CarStuff.Car;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> cars;
    private ArrayList<Dealer> dealers;
    private ArrayList<Customer> customers;
    private Till till;

    public Dealership(ArrayList<Car> cars, ArrayList<Dealer> dealers, ArrayList<Customer> customers, Till till){
        this.cars = cars;
        this.dealers = dealers;
        this.customers = customers;
        this.till = till;
    }

    public ArrayList<Car> getCars() {
        return this.cars;
    }

    public ArrayList<Dealer> getDealers() {
        return dealers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Till getTill() {
        return this.till;
    }

    public void sellCar() {
        this.dealers.get(0).sellCar(this.customers.get(0),this.till, this.cars.get(0));
        this.getCars().remove(0);
    }

    public void buyCar() {
        Dealer dealer = this.dealers.get(0);
        Customer customer = this.customers.get(0);
       if ( dealer.buyCar(customer, this.till) ) {
           Car carToBuy = customer.sellCar();
           cars.add(carToBuy);
       }
    }

    public void repairCar(Car car, int cost) {
        this.till.removeMoney(cost);
        car.repair(cost);
    }
}
