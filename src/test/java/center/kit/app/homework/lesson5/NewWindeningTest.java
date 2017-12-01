package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class NewWindeningTest {
    @Test
    public void windeningTest() {
        double result = 10.0, expRes = 10.0;
        NewWindening windening = new NewWindening();
        double actRes = windening.Windening();
        Assert.assertEquals(expRes, actRes, 0);
    }
}
