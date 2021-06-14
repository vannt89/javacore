import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BTVN4Test {
    BTVN4 btvn4 = new BTVN4();

    @Test
    void giaiBTVN4() {
        String[] output = {"BMW", "Hyundai", "Mercedes", "Toyota", "Vinfast"};
        assertThat(btvn4.giaiBTVN4()).isNotNull().isEqualTo(output);
    }

}