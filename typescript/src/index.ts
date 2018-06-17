import {Roulette} from "./roulette";
import {Waiter} from "./waiter";
import {Randomizer} from "./randomizer";

export function createRouletteApplication() {
  return new Roulette(new Waiter(), new Randomizer());
}
