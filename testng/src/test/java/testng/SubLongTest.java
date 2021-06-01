package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SubLongTest extends BaseTest {

    @Test(dataProvider = "valuesForSubLongTest")
    public void subLong(long a, long b, long expectedResult) {
        long result = calculator.sub(a,b);
        assertEquals(result, expectedResult, "Invalid result of sub operation");
    }

    @DataProvider(name = "valuesForSubLongTest")
    public Object[][] valuesForSubLong() {
        return new Object[][]{
                {19L, 17L, 2L},
                {0L, 1L, -1L}
        };
    }


}