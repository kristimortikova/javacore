package center.kit.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void mutiplyTest() {
        int a = 1, b = 2, expRes = 2;
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.multiply(a, b);
        Assert.assertEquals(actRes, expRes);
    }

    @Ignore("jgjj")
    @Test
    public void sumTest() {
        int a = 1, b = 2, expRes = 3;
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.sum(a, b);
        Assert.assertEquals(expRes, actRes);
    }

    @Test
    public void slashTest() {
        int c = 8, d = 3;
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(c % d, mathFunc.slash());

    }

}