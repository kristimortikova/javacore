package center.kit.app.homework.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class NewTest3Test {
    @FileParameters(value = "src/test/resources/test3data.csv",
            mapper = CsvWithHeaderMapper.class)
    @Test
    public void wideningTest(int argY, short argX, int expOut) {
        NewTest3 newTest3 = new NewTest3();
        Assert.assertEquals(expOut, newTest3.widening(argY, argX));


    }
}
