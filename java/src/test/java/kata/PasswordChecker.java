package kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PasswordChecker {

    public boolean check(String password) {
        return password.length() >= 7
                && containsDigit(password)
                && containsLetter(password);
    }

    public boolean checkAdmin(String password) {
        return password.length() >= 10
                && check(password)
                && containsSpecialCharacter(password);
    }

    private boolean containsSpecialCharacter(String password) {
        return password.matches(".*[\\.!?].*");
    }

    private boolean containsLetter(String password) {
        return password.matches(".*[a-zA-Z].*");
    }

    private boolean containsDigit(String password) {
        return password.matches(".*\\d.*");
    }

}
