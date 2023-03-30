import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int actual = service.remain(700);

        Assert.assertEquals(actual,expected);
        }


    }

