import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testMethodSub() {
        assertEquals(5, calculator.sub(10, 5));
        assertNotEquals(5, calculator.sub(5, 3));
    }

    @Test
    public void testMethodMul() {
        assertEquals(25, calculator.mul(5, 5));
        assertNotEquals(5, calculator.mul(5, 3));
    }

    @Test
    public void testAssertTrueFalse() {
        assertTrue(calculator.compareString("Hihi", "Hihi"));
        assertFalse(calculator.compareString("Haha", "Hihi"), "strA is not contains strB");
    }

    @Test
    public void testAssertSame() {
        String str1 = "VinID";
        String newStr1 = new String(str1);

        assertSame(str1, newStr1);
        assertNotSame(str1, newStr1);
    }
}
