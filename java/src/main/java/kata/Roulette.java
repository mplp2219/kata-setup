package kata;

public class Roulette {

  private final Ball ball;
  private final Randomizer randomizer;

  public Roulette(Ball ball, Randomizer randomizer) {
    this.ball = ball;
    this.randomizer = randomizer;
  }

  public Result playGame() {
    ball.roll();
    int randomResult = randomizer.getRouletteResult();
    return new Result(randomResult);
  }

}
