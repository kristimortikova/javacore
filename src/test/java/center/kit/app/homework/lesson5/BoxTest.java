package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class BoxTest {
    @Test
    public void boxTest() {
        int a = 3, b = 4, c = 3, expRes = 36;
        Box box = new Box();
        int actRes = box.volume(a, b, c);
        Assert.assertEquals(expRes, actRes);
    }
}
