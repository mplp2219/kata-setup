package kata;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

public class PasswordTest {
    private PasswordChecker checker = new PasswordChecker();

    @Test public void 
    must_have_7_atleast_chars() {
        assertFalse(checker.check("h"));
        assertFalse(checker.check("helpme"));
        assertTrue(checker.check("helpme7"));
        assertTrue(checker.check("helpme88"));
    }

    @Test public void
    must_contain_atleast_one_digit() throws Exception {
        assertFalse(checker.check("helpmenow"));
    }
    
    @Test public void 
    must_contain_atleast_one_character() throws Exception {
        assertFalse(checker.check("1234567"));
    }
    
    @Test public void 
    can_contain_capital_letters() throws Exception {
        assertTrue(checker.check("WOW5OCOOL"));
    }

    
    @Test public void 
    admins_must_have_atleast_10_chars() throws Exception {
        String tooShort = "helpme7";
        assertFalse(checker.checkAdmin(tooShort));
        assertTrue(checker.checkAdmin("10helpme.."));
    }


    @Test public void 
    admins_must_contain_atleast_one_digit() throws Exception {
        assertFalse(checker.checkAdmin("helpmenowpleas"));
    }
    
    @Test public void 
    admins_must_contain_atleast_one_letter() throws Exception {
        assertFalse(checker.checkAdmin("1234567890"));
    }
    
    @Test public void 
    admins_must_contain_atleast_one_special_char() throws Exception {
        assertFalse(checker.checkAdmin("heyYouWom4n"));
        assertTrue(checker.checkAdmin(".heyYouWom4n"));
        assertTrue(checker.checkAdmin("hey!YouWom4n"));
        assertTrue(checker.checkAdmin("hey?YouWom4n"));
    }


}
