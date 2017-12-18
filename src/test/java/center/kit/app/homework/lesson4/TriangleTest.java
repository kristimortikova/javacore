package center.kit.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void SideTriangleTest() {
        boolean actRes = Triangle.SideVerif(5, 25);
        Assert.assertEquals(true, actRes);
    }

    @Test
    public void SideTriangleTest2() {
        boolean actRes = Triangle.SideVerif(6, 49);
        Assert.assertEquals(false, actRes);
    }

    @Test
    public void SideTriangleTest3() {
        boolean actRes = Triangle.SideVerif(13, 169);
        Assert.assertEquals(true, actRes);
    }

    @Test
    public void SideTriangleTest4() {
        boolean actRes = Triangle.SideVerif(7, 36);
        Assert.assertEquals(false, actRes);
    }

    @Test
    public void SideTriangleTest5() {
        boolean actRes = Triangle.SideVerif(10, 100);
        Assert.assertEquals(true, actRes);
    }
}
