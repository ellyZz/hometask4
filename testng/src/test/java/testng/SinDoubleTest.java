package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SinDoubleTest extends BaseTest{

    @Test(dataProvider = "valuesForSinDoubleTest", groups = "Trigonometry")
    public void sinDouble(double a, double expectedResult) {
        double result = calculator.sin(a);
        assertEquals(result, expectedResult, "Invalid result of Sin operation");
    }

    @DataProvider(name = "valuesForSinDoubleTest")
    public Object[][] valuesForSinDouble() {
        return new Object[][]{
                {0.0, 0.0},
                {Math.PI/2, 1.0}
        };
    }
}
