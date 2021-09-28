package dev.surehand;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator test")
class CalculatorTest {

//    private int a, b;
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Nested
    @DisplayName("Methods with int arguments.")
    @Tag("Integer")
    class intTests {
        @ParameterizedTest()
        @CsvSource({"2, 3, 5", "-2, -3, -5", "2, -3, -1", "0, 2, 2", "2, 0, 2", "0, 0, 0"})
        @DisplayName("Add method with int arguments")
        void testAddInt(int a, int b, int result) {
            assertEquals(result, calc.add(a, b));
        }

        @ParameterizedTest()
        @CsvSource({"2, 3, -1", "-2, -3, 1", "2, -3, 5", "0, 2, -2", "2, 0, 2", "0, 0, 0"})
        @DisplayName("Subtract method with int arguments")
        void testSubtractInt(int a, int b, int result) {
            assertEquals(result, calc.subtract(a, b));
        }

        @ParameterizedTest()
        @CsvSource({"2, 3, 6", "-2, -3, 6", "2, -3, -6", "0, 2, 0", "2, 0, 0", "0, 0, 0"})
        @DisplayName("Multiply method with int arguments")
        void testMultiplyInt(int a, int b, int result) {
            assertEquals(result, calc.multiply(a, b));
        }

        @ParameterizedTest()
        @CsvSource({"6, 3, 2", "-3, -2, 1", "5, -3, -1", "0, 2, 0"})
        @DisplayName("Integer divide method with int arguments")
        void testDivideInt(int a, int b, int result) {
            assertEquals(result, calc.divide(a, b));
        }
    }

    @Nested
    @DisplayName("Methods with double arguments. Arguments and result are rounded to 14 decimal places.")
    @Tag("Double")
    class doubleTests {
        @ParameterizedTest()
        @CsvSource({"2.0, 3, 5", "-2, -4, -6", "2, -3.0, -1", "0, 2.5, 2.5"})
        @DisplayName("Add method with double arguments")
        void testAddDouble(double a, double b, double result) {
            assertEquals(result, calc.add(a, b));
        }

        @ParameterizedTest()
        @CsvSource({"2, 3, -1", "-2, -3, 1", "2, -3, 5", "0, 2, -2", "2, 0, 2", "0, 0, 0"})
        @DisplayName("Subtract method double arguments")
        void testSubtractDouble(double a, double b, double result) {
            assertEquals(result, calc.subtract(a, b));
        }

        @ParameterizedTest()
        @CsvSource({"2.0, 3, 6", "-2, -3.5, 7", "2.1, -3.2, -6.72", "0, 2.5, 0.0", "2, 0.0, 0.0", "0, 0, 0"})
        @DisplayName("Multiply method with double arguments")
        void testMultiplyDouble(double a, double b, double result) {
            assertEquals(result, calc.multiply(a, b));
        }

        @ParameterizedTest()
        @CsvSource({"6.5, 2, 3.25", "-3, -2.5, 1.2", "1.0, -3.0, -0.33333333333333", "2.0, 3.0, 0.66666666666667"})
        @DisplayName("Divide method with double arguments")
        void testDivideDouble(double a, double b, double result) {
            assertEquals(result, calc.divide(a, b));
        }
    }

    @Nested
    @DisplayName("Divide by zero.")
    class divideByZeroTests {
        @ParameterizedTest()
        @CsvSource({"2, 0", "0, 0"})
        @DisplayName("Throws when integer divided by zero")
        @Tag("Integer")
        void testIntDivideByZero(int a, int b) {
            assertThrows(ArithmeticException.class, () -> calc.divide(a, b), "throws when divided by zero");
        }

        @ParameterizedTest()
        @CsvSource({"2.5, 0", "1, 0"})
        @DisplayName("Positive argument divided by zero, result POSITIVE_INFINITY")
        @Tag("Double")
        void testPositiveDividedByZero(double a, double b) {
            double result = Double.POSITIVE_INFINITY;
            assertEquals(result, calc.divide(a, b));
        }

        @ParameterizedTest()
        @CsvSource({"-2.5, 0", "-1, 0"})
        @DisplayName("Negative argument divided by zero, result NEGATIVE_INFINITY")
        @Tag("Double")
        void testNegativeDividedByZero(double a, double b) {
            double result = Double.NEGATIVE_INFINITY;
            assertEquals(result, calc.divide(a, b));
        }

        @ParameterizedTest()
        @CsvSource({"-0.0, 0", "0, 0"})
        @DisplayName("Zero divided by zero, result NaN")
        void testZeroDividedByZero(double a, double b) {
            double result = Double.NaN;
            assertEquals(result, calc.divide(a, b));
        }
    }

    @AfterEach
    void tearDown() {
    }
}