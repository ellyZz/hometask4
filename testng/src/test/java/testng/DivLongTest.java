package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivLongTest extends BaseTest {

    @Test(dataProvider = "valuesForDivLongTest")
    public void divLong(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        assertEquals(result, expectedResult, "Invalid result of div operation");

    }

    @DataProvider(name = "valuesForDivLongTest")
    public Object[][] valuesForDivLong() {
        return new Object[][]{
                {9L, 3L, 3L},
                {10L, 2L, 5L}
        };
    }

    @Test(dataProvider = "valuesForDivLongByZeroTest", expectedExceptions = NumberFormatException.class)
    public void divLongByZero(long a, long b) {
        long result = calculator.div(a, b);
    }

    @DataProvider(name = "valuesForDivLongByZeroTest")
    public Object[][] valuesForDivByZeroLong() {
        return new Object[][]{
                {9L, 0L},
                {10L, 0L}
        };
    }
}
