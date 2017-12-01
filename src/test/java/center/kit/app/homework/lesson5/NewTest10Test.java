package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class NewTest10Test {
    @Test
    public void circleAreaTest() {
        double circleArea = 1878.0519422976122, expRes = 1878.0519422976122;
        NewTest10 test = new NewTest10();
        double actRes = test.CircleArea();
        Assert.assertEquals(expRes, actRes, 0.0);
    }
}
