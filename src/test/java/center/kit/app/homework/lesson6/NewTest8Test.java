package center.kit.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class NewTest8Test {
    @FileParameters(value = "src/test/resources/test8data.csv", mapper = CsvWithHeaderMapper.class)
    @Test
    public void partTest(int argA, int argB, int expOut) {
        NewTest8 newTest8 = new NewTest8();
        Assert.assertEquals(expOut, newTest8.part(argA, argB));
    }

}
