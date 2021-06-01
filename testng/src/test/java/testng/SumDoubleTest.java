package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumDoubleTest extends BaseTest {
    @Test(dataProvider = "valuesForSumDoubleTests")
    public void SumDouble(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        assertEquals(result, expectedResult, "Invalid result");
    }

    @DataProvider(name = "valuesForSumDoubleTests")
    public Object[][] valuesForSumDouble() {
        return new Object[][]{
                {11.2, 12.7, 23.9},
                {2.4, -15.4, -13}
        };
    }

}
