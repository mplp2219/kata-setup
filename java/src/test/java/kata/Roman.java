package kata;

import org.junit.platform.commons.util.StringUtils;

public class Roman {
    public String toRoman(int number) {
        String romanNumber = "";
        while (number >= 1) {
            romanNumber += "I";
            number--;
        }
        return romanNumber;
    }
}
