package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivDoubleTest extends BaseTest {

    @Test(dataProvider = "valuesForDivDoubleTest")
    public void divDouble(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        assertEquals(result, expectedResult, "Invalid result of div operation");

    }

    @DataProvider(name = "valuesForDivDoubleTest")
    public Object[][] valuesForDivDouble() {
        return new Object[][]{
                {9.3, 3.0, 3.1},
                {55.5, 5.0, 11.1}
        };
    }
}
