import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Bai1Test {
    Bai1 bai1 = new Bai1();

    @Test
    void testCountWordsUpperCase() {
        String input = "You Only Live Once. But if You do it right. once is Enough";
        assertThat(bai1.countWordsUpperCase(input)).isNotNull().isEqualTo(7);
    }

    @Test
    void testCapsFirstLetter1() {
        String input = "You Only Live Once. But if You do it right. once is Enough";
        assertThat(bai1.capsFirstLetter1(input)).isNotNull().isEqualTo("You Only Live Once. But If You Do It Right. Once Is Enough");
    }

    @Test
    void testCapsFirstLetter2() {
        String input = "you Only Live Once. But if You do it right. once is Enough";
        assertThat(bai1.capsFirstLetter2(input)).isNotNull().isEqualTo("You only live once. But if you do it right. Once is enough");
//        assertThat(bai1.capsFirstLetter(input)).isNotNull().contains("You only live once. But if you do it right. Once is enough");
    }
}