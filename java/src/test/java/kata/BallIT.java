package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;


/**
 * IT integration-test testing the real thing in integration
 * the suffix IT means that it's run in a separate test suite.
 * Another possibility is to put this into a separate directory like src/integration-test/java
 */
public class BallIT {

  @Test
  public void itRollsForAGivenAmountOfTime() throws Exception {
    Ball ball = new Ball();

    double before = System.currentTimeMillis();
    ball.roll();
    double after = System.currentTimeMillis();

    int twentySeconds = 20000;
    assertThat(after - before).isCloseTo(twentySeconds, within(3d));

  }
}
