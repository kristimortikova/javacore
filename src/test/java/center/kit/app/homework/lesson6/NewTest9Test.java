package center.kit.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NewTest9Test {
    @FileParameters(value = "src/test/resources/test9data.csv", mapper = CsvWithHeaderMapper.class)
    @Test
    public void cycleTest(int argA, int argB, int expOut) {
        NewTest9 newTest9 = new NewTest9();
        Assert.assertEquals(expOut, newTest9.cycle(argA, argB));
    }
}
