package junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDoubleTest extends BaseTest {

    @ParameterizedTest
    @MethodSource("valuesForSumDouble")
    void sumDouble(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        assertEquals(result, expectedResult, "Invalid result of Sum operation");
    }

    @Parameterized.Parameters
    public static Object[][] valuesForSumDouble() {
        return new Object[][]{
                {Double.valueOf("11.2"), Double.valueOf("12.7"), Double.valueOf("23.9")},
                {2.4, -15.4, -13}
        };
    }
}
