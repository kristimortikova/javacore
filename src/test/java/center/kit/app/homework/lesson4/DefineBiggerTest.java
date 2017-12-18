package center.kit.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class DefineBiggerTest {
    @Test
    public void DefineTest() {
        boolean actRes = DefineBigger.DefNum(9, 7);
        Assert.assertEquals(true, actRes);
    }

    @Test
    public void DefineTest2() {
        boolean actRes = DefineBigger.DefNum(6, 6);
        Assert.assertEquals(false, actRes);

    }

    @Test
    public void DefineTest3() {
        boolean actRes = DefineBigger.DefNum(5, 56);
        Assert.assertEquals(false, actRes);
    }

    @Test
    public void DefineTest4() {
        boolean actRes = DefineBigger.DefNum(19, 7);
        Assert.assertEquals(true, actRes);
    }

    @Test
    public void DefineTest5() {
        boolean actRes = DefineBigger.DefNum(18, 18);
        Assert.assertEquals(false, actRes);
    }
}

