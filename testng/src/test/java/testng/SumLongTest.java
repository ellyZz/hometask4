package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SumLongTest extends BaseTest {

    @Test(dataProvider = "valuesForSumLongTest")
    public void sumLong(long a, long b, long expectedResult) {
        long result = calculator.sum(a, b);
        assertEquals(result, expectedResult, "Invalid result of sum operation");
    }

    @DataProvider(name = "valuesForSumLongTest")
    public Object[][] valuesForSumLong() {
        return new Object[][]{
                {9L, 17L, 26L},
                {-10L, -1L, -11L}
        };
    }


}