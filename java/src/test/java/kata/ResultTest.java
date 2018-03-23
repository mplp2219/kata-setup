package kata;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultTest {

    @Rule
    public ExpectedException expect = ExpectedException.none();

    @Test
    public void the37CorrespondsTo00() {
        Result result = new Result(37);
        assertThat(result.number).isEqualTo("00");
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        assertNumberResult(0, "0");
        assertNumberResult(12, "12");
        assertNumberResult(36, "36");
        assertNumberResult(37, "00");
    }

    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        assertColorResult(0, Result.Color.GREEN);
        assertColorResult(37, Result.Color.GREEN);
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        assertColorResult(2, Result.Color.BLACK);
        assertColorResult(14, Result.Color.BLACK);
        assertColorResult(36, Result.Color.BLACK);
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        assertColorResult(1, Result.Color.RED);
        assertColorResult(7, Result.Color.RED);
        assertColorResult(35, Result.Color.RED);
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {

        expect.expect(RouletteException.class);
        expect.expectMessage("Result can't be 38");

        new Result(38);
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {

        expect.expect(RouletteException.class);
        expect.expectMessage("Result can't be -1");

        new Result(-1);

    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {

        Result.Color color = new Result(randomizerValue).color;
        assertThat(color).isEqualTo(expectedColor);

    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
        assertThat(new Result(randomizerValue).number).isEqualTo(expectedNumber);
    }
}