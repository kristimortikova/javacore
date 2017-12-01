package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class NewTest7Test {
    @Test
    public void TimeTest() {
        int x = 56, expRes = 56;
        NewTest7 time = new NewTest7();
        int actRes = time.Time(56);
        Assert.assertEquals(expRes, actRes);

    }
}
