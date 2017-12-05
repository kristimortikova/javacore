package center.kit.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NewTest2Test {
    @Test
    @FileParameters(value = "src/test/resources/test2data.csv",
            mapper = CsvWithHeaderMapper.class)
    public void sumTest(int argA, int argB, int argC, int expOut) {
        NewTest2 test = new NewTest2();
        Assert.assertEquals(expOut, test.sum(argA, argB, argC));

    }

}
