package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CosDoubleTest extends BaseTest{

    @Test(dataProvider = "valuesForCosDoubleTest", groups = "Trigonometry")
    public void cosDouble(double a, double expectedResult) {
        double result = calculator.cos(a);
        assertEquals(result, expectedResult, "Invalid result of Cos operation");
    }

    @DataProvider(name = "valuesForCosDoubleTest")
    public Object[][] valuesForCosDouble() {
        return new Object[][]{
                {0.0, 1.0},
                {Math.PI/2, 0.0}
        };
    }
}
