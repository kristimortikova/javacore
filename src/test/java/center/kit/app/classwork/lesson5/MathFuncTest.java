package center.kit.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void mutiplyTest() {
        int a = 1, b = 2, expRes = 4;
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.multiply(a, b);
        Assert.assertEquals(actRes, expRes);
    }

    @Test
    public void sumTest() {
        int a = 1, b = 2, expRes = 3;
        MathFunc mathFunc = new MathFunc();
        int actRes = mathFunc.sum(a, b);
        Assert.assertEquals(expRes, actRes);
    }
}