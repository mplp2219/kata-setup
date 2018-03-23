package kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import kata.Result.Color;
import org.junit.jupiter.api.Test;

public class RouletteAT {
  private Randomizer randomizer = mock(Randomizer.class);
  private Ball ball = mock(Ball.class);

  @Test
  public void itWaitsForTheBallToStop() {
    Roulette roulette = new Roulette(ball, randomizer);

    roulette.playGame();

    verify(ball).roll();
  }

  @Test()
  public void itProvidesAResultWithColor() throws Exception {
    Randomizer randomizer1 = mock(Randomizer.class);
    when(randomizer1.getRouletteResult()).thenReturn(0);
    Roulette roulette = new Roulette(ball, randomizer1);

    Result actualResult = roulette.playGame();

    assertEquals("0", actualResult.number);

    assertEquals(Color.GREEN, actualResult.color);
  }

}
