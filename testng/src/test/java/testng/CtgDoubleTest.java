package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CtgDoubleTest extends BaseTest{

    @Test(dataProvider = "valuesForCtgDoubleTest", groups = "Trigonometry")
    public void ctgDouble(double a, double expectedResult) {
        double result = calculator.ctg(a);
        assertEquals(result, expectedResult, "Invalid result of Ctg operation");
    }

    @DataProvider(name = "valuesForCtgDoubleTest")
    public Object[][] valuesForCtgDouble() {
        return new Object[][]{
                {Math.PI/4, 1.0},
                {Math.PI/2, 0.0}
        };
    }
}
