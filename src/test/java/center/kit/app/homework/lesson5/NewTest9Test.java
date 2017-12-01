package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class NewTest9Test {
    @Test
    public void sumTest() {
        int int2 = 1;
        NewTest9 sum = new NewTest9();

        Assert.assertEquals(int2, sum.Sum());
    }
}
