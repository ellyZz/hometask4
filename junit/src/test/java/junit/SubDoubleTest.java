package junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubDoubleTest extends BaseTest{

    @ParameterizedTest
    @MethodSource("valuesForSubDouble")
    void subDouble(double a, double b, double expectedResult) {
        double result = calculator.sub(a, b);
        assertEquals(result, expectedResult, "Invalid result of Sub operation");
    }

    @Parameterized.Parameters
    public static Object[][] valuesForSubDouble() {
        return new Object[][]{
                {Double.valueOf("190.0"), Double.valueOf("170.0"), Double.valueOf("20.0")},
                {10.0, 20.0, -10.0}
        };
    }

}
