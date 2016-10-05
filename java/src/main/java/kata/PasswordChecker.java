package kata;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import kata.Validator.DigitValidator;
import kata.Validator.LengthValidator;
import kata.Validator.LetterValidator;
import kata.Validator.SpecialCharValidator;

public class PasswordChecker {

    public List<String> check(String password) {
        List<Validator> validators = asList(
                new LengthValidator(7),
                new DigitValidator(),
                new LetterValidator());

        return validate(password, validators);
    }

    public List<String> checkAdmin(String password) {

        return validate(password, adminValidators);
    }

    private List<Validator> adminValidators = asList(
            new LengthValidator(10),
            new DigitValidator(),
            new LetterValidator(),
            new SpecialCharValidator());


    protected List<String> validate(String password, List<Validator> validators) {

        List<String> errors = emptyList();
        for (Validator v : validators) {
            errors.add(v.validate(password));
        }
        return errors;
    }

    private ArrayList<String> emptyList() {
        return new ArrayList<String>() {
            @Override
            public boolean add(String s) {
                if (s.isEmpty())
                    return false;
                else return super.add(s);
            }
        };
    }

}