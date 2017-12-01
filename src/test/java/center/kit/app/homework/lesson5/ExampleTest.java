package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {
    @Test
    public void setcycleTest() {
        int x = 11;
        Example example = new Example();
        Assert.assertEquals(x, example.setcycle());
    }
}
