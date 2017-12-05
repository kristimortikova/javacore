package center.kit.app.homework.lesson6;

import center.kit.app.homework.lesson5.Box;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class BoxDataTest {
    @Test
    @FileParameters(value = "src/test/resources/boxdata.csv",
            mapper = CsvWithHeaderMapper.class)
    public void boxVolumeDataTest(int argA, int argB, int argC, int expOut) {
        Box box = new Box();
        Assert.assertEquals(expOut, box.volume(argA, argB, argC));
    }

}
