import {Waiter} from "./waiter";
import {Randomizer} from "./randomizer";

export class Roulette {
  constructor(private waiter: Waiter, private randomizer: Randomizer) {

  }

  play(): number {
    this.waiter.wait()
    return this.randomizer.getValue();
  }
}
