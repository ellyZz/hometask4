package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SubDoubleTest extends BaseTest {

    @Test(dataProvider = "valuesForSubDoubleTest")
    public void subDouble(double a, double b, double expectedResult) {
        double result = calculator.sub(a,b);
        assertEquals(result, expectedResult, "Invalid result of sub operation");
    }

    @DataProvider(name = "valuesForSubDoubleTest")
    public Object[][] valuesForSubDouble() {
        return new Object[][]{
                {190.0, 171.0, 19.0},
                {10.0, 20.0, -10.0}
        };
    }


}