package kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanShould {

    @Test
    void translates4toIV() {
        assertThat(toRoman(4)).isEqualTo("IV");
    }

    @Test
    void translates8toVII() {
        assertThat(toRoman(8)).isEqualTo("VIII");
    }

    @Test
    void translate9toIX() {
        assertThat(toRoman(9)).isEqualTo("IX");
    }

    @Test
    void appendXforMultiplesOfTenUnder40() {
        assertThat(toRoman(30)).isEqualTo("XXX");
    }

    @Test
    void acceptance() {
        assertThat(toRoman(3888)).isEqualTo("MMMDCCCLXXXVIII");
        assertThat(toRoman(1999)).isEqualTo("MCMXCIX");
        assertThat(toRoman(1440)).isEqualTo("MCDXL");
    }

    private String toRoman(int i) {
        return new Roman().toRoman(i);
    }
}
