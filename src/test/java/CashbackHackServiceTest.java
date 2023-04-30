import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testAmountBefore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void testAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }

    @Test
    public void testAmountMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }
}
