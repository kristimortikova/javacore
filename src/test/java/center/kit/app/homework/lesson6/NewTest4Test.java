package center.kit.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NewTest4Test {
    @FileParameters(value = "src/test/resources/test4data.csv",
            mapper = CsvWithHeaderMapper.class)
    @Test
    public void eventTest(int argA, int argB, int expOut) {
        NewTest4 newTest4 = new NewTest4();
        Assert.assertEquals(expOut, newTest4.event(argA, argB));
    }
}
