import {Waiter} from "./waiter";
import {Randomizer} from "./randomizer";
import {RouletteResult} from "./roulette-result";

export class Roulette {

  constructor(private waiter: Waiter, private randomizer: Randomizer) {
  }

  async play(): Promise<RouletteResult> {
    await this.waiter.wait()
    let value = this.randomizer.getValue();
    return new RouletteResult(value);
  }
}
