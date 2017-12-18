package center.kit.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {
    @Test
    public void OddOrEvenTest() {
        boolean actRes = OddEven.OddorEvenVerif(8);
        Assert.assertEquals(true, actRes);
    }

    @Test
    public void OddOrEventest2() {
        boolean actRes = OddEven.OddorEvenVerif(9);
        Assert.assertEquals(false, actRes);
    }

    @Test
    public void OddOrEvenTest3() {
        boolean actRes = OddEven.OddorEvenVerif(4);
        Assert.assertEquals(true, actRes);
    }

    @Test
    public void OddOrEvenTest4() {
        boolean actRes = OddEven.OddorEvenVerif(15);
        Assert.assertEquals(false, actRes);
    }

    @Test
    public void OddOrEvenTest5() {
        boolean actRes = OddEven.OddorEvenVerif(18);
        Assert.assertEquals(true, actRes);
    }


}
