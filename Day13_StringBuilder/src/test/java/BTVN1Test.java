import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class BTVN1Test {
    BTVN1 btvn1 = new BTVN1();

    public void checkCondition(String input) {
        assertTrue(input.trim().length() >= 2, "Không phải tên đầy đủ");
        assertThat(btvn1.giaiBTVN1(input)).isNotNull().containsPattern("^[A-Za-z]+((\\s)?([A-Za-z])+)*$");
    }

    @Test
    @DisplayName("testBTVN1_Case1")
    public void testBTVN1_Case1() {
        String input = " nguyen thi  van ";
        checkCondition(input);
    }

    @Test
    @DisplayName("testBTVN1_Case2")
    public void testBTVN1_Case2() {
        String input = " nguyEn Thi  vAn ";
        checkCondition(input);
    }

    @Test
    @DisplayName("testBTVN1_Case3")
    public void testBTVN1_Case3() {
        String input = " nguyen  thi van 34 ";
        checkCondition(input);
    }

    @Test
    @DisplayName("testBTVN1_Case4")
    public void testBTVN1_Case4() {
        String input = " v ";
        checkCondition(input);
    }

}