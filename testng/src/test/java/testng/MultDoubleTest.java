package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class MultDoubleTest extends BaseTest {

    @Test(dataProvider = "valuesForMultDoubleTest")
    public void multDouble(double a, double b, double expectedResult) {
        double result = calculator.mult(a,b);
        assertEquals(result, expectedResult, "Invalid result of mult operation");
    }

    @DataProvider(name = "valuesForMultDoubleTest")
    public Object[][] valuesForMultDouble() {
        return new Object[][]{
                {5.1, 5.2, 26.52},
                {-10.4, -1.6, 10.64}
        };
    }


}