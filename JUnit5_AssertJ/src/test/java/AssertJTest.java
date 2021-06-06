import org.assertj.core.data.Offset;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test
    @DisplayName("testAssertArray")
    public void testAssertArray() {
        int[] numbers = new int[]{11, 22, 5, 9, 2, 5, 7};
        assertThat(numbers).contains(5);

        assertThat(numbers).startsWith(11);

        assertThat(numbers).isNotEmpty()
                .contains(2, 7)
                .doesNotContain(6)
                .containsSequence(11, 22)
                .hasSize(7);
    }

    @Test
    @DisplayName("testAssertString")
    public void testAssertString() {
        String input = "I love you to the moon and back";
        String clone = input.toUpperCase();

        assertThat(input).isNotEmpty()
                .startsWith("I")
                .contains("moon")
                .doesNotContain("sun")
                .containsSequence("love", "you")
                .hasSize(31);
        assertThat(input).isEqualToIgnoringCase(clone);
    }

    @Test
    @DisplayName("testAssertNumber")
    public void testAssertNumber() {
        double price = 12.0;
        assertThat(price).isEqualTo(12.2, withPrecision(1d));
        assertThat(price).isCloseTo(15.0, Offset.offset(4d));
        assertThat(price).isBetween(10.0, 15.0); //value >= 10 and <= 15
        assertThat(price).isStrictlyBetween(10.0, 15.0); //value > 10 and < 15
        assertThat(price).isNotZero();
    }

    @Test
    @DisplayName("testPhoneNumber")
    //start with 0, have 10 digits, not contain character
    public void testPhoneNumber() {
        String phone = "0902299316";
        assertThat(phone).startsWith("0").hasSize(10).containsOnlyDigits();
    }


    ////// -------BTVN-------
    @Test
    @DisplayName("BTVN1_testEmail")
    public void BTVN1_testEmail() {
        String mail = "vannt34@onemount.com";
        assertThat(mail).isNotEmpty()
                .containsPattern("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    @Test
    @DisplayName("BTVN2_testWeightOfPerson")
    public void BTVN2_testWeightOfPerson() {
        double weight = 54.5;
        assertThat(weight).isNotZero()
                .isStrictlyBetween(1.5, 200.0);
    }

    @Test
    @DisplayName("BTVN3_testArrayID")
    public void BTVN3_testArrayID() {
        String[] arrID = {"351890025", "351890026", "351890027", "351890028", "351890029"};
        for (String id : arrID) {
            assertThat(id).isNotEmpty().hasSize(9).containsOnlyDigits();
        }
    }
}
