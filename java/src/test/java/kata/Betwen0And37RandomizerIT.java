package kata;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.IntStream;

import org.junit.Test;

public class Betwen0And37RandomizerIT {

	private Between0And37Randomizer javaRandomizer = new Between0And37Randomizer();

	@Test
	public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
		assertThat(generateResults().min().getAsInt()).isEqualTo(0);
		assertThat(generateResults().max().getAsInt()).isEqualTo(37);
	}

	@Test
	public void allNumbersOccur() {
		IntStream uniqueResults = generateResults().distinct();
		assertThat(uniqueResults).size().isEqualTo(38);
	}

	private IntStream generateResults() {
		return IntStream.range(0, 10000).map(i -> javaRandomizer.getRouletteResult());
	}

}
