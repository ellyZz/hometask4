package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PowDoubleTest extends BaseTest {

    @Test(dataProvider = "valuesForPowDoubleTest")
    public void powDouble(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);
        assertEquals(result, expectedResult, "Invalid result of pow operation");

    }

    @DataProvider(name = "valuesForPowDoubleTest")
    public Object[][] valuesForPowDouble() {
        return new Object[][]{
                {9.5, 3.7, 4145.50401},
                {2.2, 1.5, 3.26313}
        };
    }
}
