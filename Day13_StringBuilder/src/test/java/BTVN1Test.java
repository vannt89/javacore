import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class BTVN1Test {
    BTVN1 btvn1 = new BTVN1();

    @Test
    @DisplayName("testBTVN1")
    public void testBTVN1() {
        assertThat(btvn1.giaiBTVN1(" nguyen thi van 4 ")).isFalse();
        assertThat(btvn1.giaiBTVN1(" nguyen thi van ")).isTrue();
        assertTrue(btvn1.giaiBTVN1(" nguyen thi  van "));
        assertFalse(btvn1.giaiBTVN1(" nguyen  thi van 5"));
    }

}