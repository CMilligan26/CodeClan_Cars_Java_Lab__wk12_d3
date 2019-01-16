import CarStuff.Car;
import CarStuff.Engine;
import CarStuff.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarTest {

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
    }
    @Test
    public void hasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(4, car.getTyres().size());
    }

    @Test
    public void hasPrice(){
        assertEquals(10, car.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", car.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Hybrid", car.getType());
    }
}
