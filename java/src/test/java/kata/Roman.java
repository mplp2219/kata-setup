package kata;

import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Roman {

    private List<Tuple2<Integer, String>> numbers = List.of(
            Tuple.of(1000, "M"),
            Tuple.of(900, "CM"),
            Tuple.of(500, "D"),
            Tuple.of(400, "CD"),
            Tuple.of(100, "C"),
            Tuple.of(90, "XC"),
            Tuple.of(50, "L"),
            Tuple.of(40, "XL"),
            Tuple.of(10, "X"),
            Tuple.of(9, "IX"),
            Tuple.of(5, "V"),
            Tuple.of(4, "IV"),
            Tuple.of(1, "I")
    );

    public String toRoman(int number) {
        StringBuilder romanNumber = new StringBuilder();
        for (Tuple2<Integer, String> n : numbers) {
            number = addAllOf(number, romanNumber, n._1, n._2);
        }
        return romanNumber.toString();
    }

    private int addAllOf(int number, StringBuilder romanNumber, int powerOfTen, String romanDigit) {
        while (number >= powerOfTen) {
            romanNumber.append(romanDigit);
            number = number - powerOfTen;
        }
        return number;
    }
}
