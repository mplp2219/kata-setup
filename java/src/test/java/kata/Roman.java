package kata;

import java.util.Map;
import java.util.TreeMap;

public class Roman {

    TreeMap<Integer, String> nums = new TreeMap<>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public String toRoman(int number) {
        StringBuilder romanNumber = new StringBuilder();
        while (number >= 1) {
            Map.Entry<Integer, String> correspondence = nums.floorEntry(number);
            romanNumber.append(correspondence.getValue());
            number -= correspondence.getKey();
        }
        return romanNumber.toString();
    }
}
