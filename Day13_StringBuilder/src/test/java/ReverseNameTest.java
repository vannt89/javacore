import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseNameTest {
    ReverseName reverseName = new ReverseName();

    @Test
    void reverseName() {
        assertEquals(reverseName.reverseName("Nguyen Thi Van"), "Van Thi Nguyen");
        assertThat(reverseName.reverseName("Nguyen Thi Van")).isNotNull().isEqualTo("Van Thi Nguyen");
    }

}