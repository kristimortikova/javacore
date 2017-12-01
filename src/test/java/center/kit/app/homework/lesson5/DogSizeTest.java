package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class DogSizeTest {
    @Test
    public void setDogTest() {
        int weight = 12;
        DogSize dogSize = new DogSize();
        Assert.assertEquals(weight, dogSize.setDog());

    }
}
