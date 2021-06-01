package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SqrtDoubleTest extends BaseTest {

    @Test(dataProvider = "valuesForSqrtDoubleTest")
    public void sqrtDouble(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        assertEquals(result, expectedResult, "Invalid result of Sqrt operation");
    }

    @DataProvider(name = "valuesForSqrtDoubleTest")
    public Object[][] valuesForSqrtDouble() {
        return new Object[][]{
                {9.3, 3.0495901363953815},
                {2.2, 1.4832396974191326}
        };
    }
}
