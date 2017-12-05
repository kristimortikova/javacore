package center.kit.app.homework.lesson6;

import center.kit.app.homework.lesson5.Example;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Example6Test {
    @FileParameters(value = "src/test/resources/example6test.csv", mapper = CsvWithHeaderMapper.class)
    @Test
    public void setcycleTest(int argA, int expOut) {
        Example example = new Example();
        Assert.assertEquals(expOut, example.setcycle(argA));
    }

}
