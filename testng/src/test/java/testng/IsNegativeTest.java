package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IsNegativeTest extends BaseTest {
    private long val;
    private boolean expectedResult;

    @Factory(dataProvider = "valuesForNegativeTest")
    public IsNegativeTest(long val, boolean expectedResult) {
        this.val = val;
        this.expectedResult = expectedResult;
    }

    @Test
    public void isNegativeTest() {
        boolean result = calculator.isNegative(val);
        assertEquals(result, expectedResult, "Invalid result of isNegative operation");
    }

    @DataProvider(name = "valuesForNegativeTest")
    public static Object[][] valuesForIsNegative() {
        return new Object[][]{
                {-11L, true},
                {11L, false}
        };

    }
}
