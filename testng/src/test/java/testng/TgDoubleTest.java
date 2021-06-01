package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TgDoubleTest extends BaseTest {

    @Test(dataProvider = "valuesForTgDoubleTest", groups = "Trigonometry")
    public void tgDouble(double a, double expectedResult) {
        double result = calculator.tg(a);
        assertEquals(result, expectedResult, "Invalid result of Tg operation");
    }

    @DataProvider(name = "valuesForTgDoubleTest")
    public Object[][] valuesForTgDouble() {
        return new Object[][]{
                {0.0, 0.0},
                {60.0, 1.732050807568877}
        };
    }
}
