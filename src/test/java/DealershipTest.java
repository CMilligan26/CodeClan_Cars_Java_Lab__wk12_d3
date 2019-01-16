import CarStuff.Car;
import CarStuff.Engine;
import CarStuff.Tyre;
import DealershipStuff.Customer;
import DealershipStuff.Dealer;
import DealershipStuff.Dealership;
import DealershipStuff.Till;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealer dealer;
    Customer customer;
    Engine engine;
    Tyre tyre1;
    Car car;
    ArrayList<Tyre> tyres;
    ArrayList<Customer> customers;
    ArrayList<Dealer> dealers;
    ArrayList<Car> cars;
    Till till;
    Dealership dealership;

    @Before
    public void before(){
        engine = new Engine();
        tyre1 = new Tyre();
        tyres = new ArrayList<>();
        tyres.add(tyre1);
        tyres.add(tyre1);
        tyres.add(tyre1);
        tyres.add(tyre1);
        car = new Car(engine, tyres, 10, "Black", "Hybrid");

        till = new Till();
        customer = new Customer(30);
        dealer = new Dealer();

        cars = new ArrayList<Car>();
        cars.add(car);
        dealers = new ArrayList<Dealer>();
        dealers.add(dealer);
        customers = new ArrayList<Customer>();
        customers.add(customer);

        dealership = new Dealership(cars, dealers, customers, till);
    }

    @Test
    public void hasCars() {
        assertEquals(1, dealership.getCars().size());
    }

    @Test
    public void hasDealers() {
        assertEquals(1, dealership.getDealers().size());
    }

    @Test
    public void hasCustomers() {
        assertEquals(1, dealership.getCustomers().size());
    }

    @Test
    public void hasTill() {
        assertEquals(till, dealership.getTill());
    }

    @Test
    public void canSellCar() {
        dealership.sellCar();
        assertEquals(0, dealership.getCars().size());
    }

    @Test
    public void canBuyCar() {
        dealership.sellCar();
        dealership.buyCar();
        assertEquals(1, dealership.getCars().size());
    }

    @Test
    public void canRepairCar(){
        dealership.getTill().addMoney(10);
        Car car = dealership.getCars().get(0);
        car.addDamage(5);
        dealership.repairCar(car, 5);
        assertEquals(10, car.getPrice());
        assertEquals(5, dealership.getTill().getMoney());
    }
}
