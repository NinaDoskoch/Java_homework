import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2, 0, 1, 1",
            "5, 3, 8, 2, 15, 1.66667",
            "-2, 2, 0, -4, -4, -1",
    })
    public void testCalculator(double a, double b, double expectedSum, double expectedDifference, double expectedProduct, double expectedQuotient) {
        assertEquals(expectedSum, calculator.add(a, b), 0.001, "Addition failed");
        assertEquals(expectedDifference, calculator.subtract(a, b), 0.001, "Subtraction failed");
        assertEquals(expectedProduct, calculator.multiply(a, b), 0.001, "Multiplication failed");
        if (b != 0) {
            assertEquals(expectedQuotient, calculator.divide(a, b), 0.001, "Division failed");
        } else {
            assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b), "Division by zero should throw IllegalArgumentException");
        }
    }
}
