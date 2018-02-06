package kata;

import io.vavr.Tuple2;

import java.util.List;

import static io.vavr.Tuple.of;

public class Roman {

    private List<Tuple2<Integer, String>> numbers = List.of(of(1000, "M"), of(900, "CM"), of(500, "D"), of(400, "CD"),
            of(100, "C"), of(90, "XC"), of(50, "L"), of(40, "XL"),
            of(10, "X"), of(9, "IX"), of(5, "V"), of(4, "IV"), of(1, "I")
    );

    public String toRoman(int number) {
        StringBuilder romanNumber = new StringBuilder();
        for (Tuple2<Integer, String> n : numbers) {
            number = addAllOf(number, romanNumber, n);
        }
        return romanNumber.toString();
    }

    private int addAllOf(int number, StringBuilder romanNumber, Tuple2<Integer, String> t)  {
        while (number >= t._1) {
            romanNumber.append(t._2);
            number = number - t._1;
        }
        return number;
    }
}
