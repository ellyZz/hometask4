package junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosDoubleTest extends BaseTest {

    @ParameterizedTest
    @MethodSource("valuesForCosDouble")
    void sumDouble(double a, double expectedResult) {
        double result = calculator.cos(a);
        assertEquals(result, expectedResult, "Invalid result of Sum operation");
    }

    @Parameterized.Parameters
    public static Object[][] valuesForCosDouble() {
        return new Object[][]{
                {0.0, 1.0},
                {Math.PI/2, 0.0}
        };
    }
}
