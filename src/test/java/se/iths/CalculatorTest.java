package se.iths;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test prep step to run before each test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Step run after all tests");
    }

    @ParameterizedTest //@Test ska inte användas när denna tag finns
    @ValueSource(ints = { 1, 4, 10})
    @DisplayName("Test addition of integers")
    public void testAddInt(int n) {
        //Calculator calc = new Calculator();
        assertEquals(n + 5 , calc.addInt(n, 5));
    }

    @Test
    void subtract() {
        assertEquals(4, calc.subtract(8,4));
    }

    @Test
    void isEqual() {
        assertNotEquals(false, calc.isEqual(7, 7));
    }

    @Test
    void product() {
        assertNotEquals(7, calc.product(2, 4));
    }

    @Test
    void division() {
        assertEquals(4, calc.division(8, 2));
    }

    @Test
    public void exceptionTesting() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calc.division(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }
}