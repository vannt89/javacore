import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    BMI bmi = new BMI();
    Triangle triangle = new Triangle();

    @Test
    public void test_01_AssetEqual_NotEquals() {
        //Test will pass
        assertEquals(21.63114885435026, bmi.calculateBMI(1.58, 54));

        //Test will pass
        assertNotEquals(29, bmi.calculateBMI(1.55, 50));

        //Test will failed
        assertNotEquals(21.63114885435026, bmi.calculateBMI(1.58, 54));

        assertEquals(29, bmi.calculateBMI(1.55, 50));
    }

    @Test
    public void test_02_AssertTrue_False() {
        //Test will pass
        assertTrue(triangle.checkTriangle(2, 3, 4));
        //Test will pass
        assertFalse(triangle.checkTriangle(1, 2, 3));
        //Test will failed
        assertFalse(triangle.checkTriangle(2, 3, 4));
        //Test will failed
        assertTrue(triangle.checkTriangle(1, 2, 3));
    }

    @Test
    public void test_03_AssertArrayEqual() {
        String stringArr1[] = {"Java", "PHP", "Golang", "Python", "Kotlin"};
        String stringArr2[] = {"Java", "PHP", "Golang", "Python", "Kotlin"};
        String stringArr3[] = {"Java", "PHP", "Golang", "Python", ".Net"};
        String stringArr4[] = {"Java", "PHP", "Golang", "Python"};

        //Test will pass
        assertArrayEquals(stringArr1, stringArr2);

        //Test will failed because element is different
        assertArrayEquals(stringArr1, stringArr3);

        //Test will failed because number of element is different
        assertArrayEquals(stringArr3, stringArr4);
    }

    @Test
    public void test_04_AssertNull_NotNull() {
        String nullString = null;
        String notNullString = "VinID";

        //Test will pass
        assertNull(nullString);
        assertNotNull(notNullString);

        //Test will failed
        assertNull(notNullString);
        assertNotNull(nullString);
    }

    @Test
    public void test_05_AssertSame_NotSame() {
        String originalObject = "VinID";
        String cloneObject = originalObject;
        String otherObject = "JUnit 5";

        //Test will pass
        assertSame(originalObject, cloneObject);
        assertNotSame(originalObject, otherObject);

        //Test will failed
        assertSame(originalObject, originalObject);
        assertNotSame(originalObject, cloneObject);
    }
}
