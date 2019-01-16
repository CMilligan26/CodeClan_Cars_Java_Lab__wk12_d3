import CarStuff.Car;
import CarStuff.Engine;
import CarStuff.Tyre;
import DealershipStuff.Customer;
import DealershipStuff.Dealer;
import DealershipStuff.Till;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    Dealer dealer;
    Customer customer;
    Engine engine;
    Tyre tyre1;
    Car car;
    ArrayList<Tyre> tyres;
    Till till;

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
    }

    @Test
    public void canSellCar() {
        assertEquals(true, dealer.sellCar(customer, till, car));
        assertEquals(1, customer.getOwnedCars().size());
        assertEquals(20, customer.getFunds());
        assertEquals(10, till.getMoney());
    }

    @Test
    public void canBuyCar() {
        dealer.sellCar(customer, till, car);
        assertEquals(1, customer.getOwnedCars().size());
        assertEquals(true, dealer.buyCar(till, car));
        assertEquals(0, till.getMoney());
    }
}
