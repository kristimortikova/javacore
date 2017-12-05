package center.kit.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NewTest5Test {
    @Test
    @FileParameters(value = "src/test/resources/test5data.csv", mapper = CsvWithHeaderMapper.class)
    public void sumTest(int argA, int argB, int expOut) {
        NewTest5 newTest5 = new NewTest5();
        Assert.assertEquals(expOut, newTest5.sum(argA, argB));
    }
}
