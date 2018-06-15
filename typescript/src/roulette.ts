import {Waiter} from "./waiter";
import {Randomizer} from "./randomizer";
import {RouletteResult} from "./roulette-result";

export enum Color {
  Black = 'black',
  Green = 'green',
  Red = 'red'

}

export class Roulette {

  constructor(private waiter: Waiter, private randomizer: Randomizer) {
  }

  play(): RouletteResult {
    this.waiter.wait()
    let value = this.randomizer.getValue();
    return new RouletteResult(value);
  }
}
