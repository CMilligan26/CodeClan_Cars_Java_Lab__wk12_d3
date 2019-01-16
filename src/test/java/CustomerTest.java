import CarStuff.Car;
import CarStuff.Engine;
import CarStuff.Tyre;
import DealershipStuff.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Engine engine;
    Tyre tyre1;
    Car car;
    ArrayList<Tyre> tyres;

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
        customer = new Customer(30);
    }

    @Test
    public void hasFunds() {
        assertEquals(30, customer.getFunds());
    }

    @Test
    public void hasNoCars() {
        assertEquals(0, customer.getOwnedCars().size());
    }

    @Test
    public void canBuyCar() {
        hasNoCars();
        customer.buyCar(car);
        assertEquals(20, customer.getFunds());
        assertEquals(1, customer.getOwnedCars().size());
    }

    @Test
    public void cannotBuyCarIfNotEnoughFunds() {
        Customer newCustomer = new Customer(5);
        newCustomer.buyCar(car);
        assertEquals(5, newCustomer.getFunds());
        assertEquals(0, newCustomer.getOwnedCars().size());
    }


}
