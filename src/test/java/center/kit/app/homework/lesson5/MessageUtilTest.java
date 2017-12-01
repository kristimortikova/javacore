package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MessageUtilTest {
    @Test

    public void testPrintMessage() {
        String message = "Pavel";
        MessageUtil messageUtil = new MessageUtil();
        System.out.println("Inside testPrintMessage()");
        Assert.assertEquals(message, messageUtil.printMessage(message));
    }
}
