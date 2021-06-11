import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class BTVN2Test {
    BTVN2 btvn2 = new BTVN2();

    @Test
    @DisplayName("giaiBTVN2")
    void giaiBTVN2() {
        assertThat(btvn2.giaiBTVN2("NV3581645")).isNotNull().hasSize(9).startsWith("NV").containsPattern("\\d{7}");
        assertEquals(btvn2.giaiBTVN2("NV35816"), "Mã nhân viên không hợp lệ");
        assertEquals(btvn2.giaiBTVN2("NN3581645"), "Mã nhân viên không hợp lệ");
        assertEquals(btvn2.giaiBTVN2("NV"), "Mã nhân viên không hợp lệ");
    }

    ///////So sánh String và StringBuilder
    ////Các đối tượng của String là bất biến và các đối tượng của StringBuffer và StringBuilder là có thể thay đổi.
    ////String đại diện cho 1 chuỗi bất biến, còn StringBuilder thì đại diện cho 1 chuỗi có thể thay đổi
    ////Với chuỗi dài và có sự thay đổi nhiều thì nên dùng StringBuilder
}