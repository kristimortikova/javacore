package center.kit.app.homework.lesson4;

import center.kit.app.classwork.lesson5.CircleArea;
import org.junit.Assert;
import org.junit.Test;

public class CircleAreaTest {
    @Test
    public void calculateTest() {
        boolean actRes = CircleArea.calculateVerif(9, 3);
        Assert.assertEquals(true, actRes);
    }

    @Test
    public void calculateTest2() {
        boolean actRes = CircleArea.calculateVerif(13, 18);
        Assert.assertEquals(false, actRes);
    }

    @Test
    public void calculateTest3() {
        boolean actRes = CircleArea.calculateVerif(154, 153);
        Assert.assertEquals(true, actRes);
    }

    @Test
    public void calculateTest4() {
        boolean actRes = CircleArea.calculateVerif(18, 19);
        Assert.assertEquals(false, actRes);
    }

    @Test
    public void calculateTest5() {
        boolean actRes = CircleArea.calculateVerif(4, 3.5);
        Assert.assertEquals(true, actRes);
    }
}
