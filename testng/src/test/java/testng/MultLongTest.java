package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class MultLongTest extends BaseTest {

    @Test(dataProvider = "valuesForMultLongTest")
    public void multLong(long a, long b, long expectedResult) {
        long result = calculator.mult(a,b);
        assertEquals(result, expectedResult, "Invalid result of mult operation");
    }

    @DataProvider(name = "valuesForMultLongTest")
    public Object[][] valuesForMultLong() {
        return new Object[][]{
                {5L, 5L, 25L},
                {-10L, -1L, 10L}
        };
    }


}