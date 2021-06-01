package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IsPositiveTest extends BaseTest {
    private long val;
    private boolean expectedResult;

    @Factory(dataProvider = "valuesForPositiveTest")
    public IsPositiveTest(long val, boolean expectedResult) {
        this.val = val;
        this.expectedResult = expectedResult;
    }

    @Test
    public void isPositiveTest() {
        boolean result = calculator.isPositive(val);
        assertEquals(result, expectedResult, "Invalid result of isPositive operation");
    }

    @DataProvider(name = "valuesForPositiveTest")
    public static Object[][] valuesForIsPositive() {
        return new Object[][]{
                {11L, true},
                {-11L, false}
        };

    }
}
