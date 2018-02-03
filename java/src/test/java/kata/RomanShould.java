package kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanShould {

    @Test
    void translate1toI() {
        assertThat(toRoman(1)).isEqualTo("I");
    }

    @Test
    void translate2toII() {
        assertThat(toRoman(2)).isEqualTo("II");
    }


    @Test
    void translate3toIII() {
        assertThat(toRoman(3)).isEqualTo("III");
    }

    private String toRoman(int i) {
        return new Roman().toRoman(i);
    }
}
