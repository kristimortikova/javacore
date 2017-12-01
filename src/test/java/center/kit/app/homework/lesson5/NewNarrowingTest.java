package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class NewNarrowingTest {
    @Test
    public void narrowingTest() {
        int int1 = 4;
        NewNarrowing narrowing = new NewNarrowing();
        Assert.assertEquals(int1, narrowing.narrowing());
    }
}
