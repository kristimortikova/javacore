package center.kit.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NewTest7Test {
    @FileParameters(value = "src/test/resources/test7data.csv", mapper = CsvWithHeaderMapper.class)
    @Test
    public void diffTest(int argA, int argB, int argC, int expOut) {
        NewTest7 newTest7 = new NewTest7();
        Assert.assertEquals(expOut, newTest7.diff(argA, argB, argC));
    }
}
