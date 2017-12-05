package center.kit.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NewTest10Test {
    @FileParameters(value = "src/test/resources/test10data.csv", mapper = CsvWithHeaderMapper.class)
    @Test
    public void narrTest(long argA, int argB, int expOut) {
        NewTest10 newTest10 = new NewTest10();
        Assert.assertEquals(expOut, newTest10.narr(argA, argB));
    }

}
