package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class NewTest8Test {
    @Test
    public void FuncTest() {
        char char1 = 65524;
        NewTest8 test = new NewTest8();
        Assert.assertEquals(char1, test.func());
    }
}
