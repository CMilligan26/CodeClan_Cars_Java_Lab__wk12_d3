import DealershipStuff.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void setUp(){
        till = new Till();
    }
    @Test
    public void startsWithNoMoney() {
        assertEquals(0, till.getMoney());
    }

    @Test
    public void canAddMoney(){
        startsWithNoMoney();
        till.addMoney(10);
        assertEquals(10, till.getMoney());
    }
}
