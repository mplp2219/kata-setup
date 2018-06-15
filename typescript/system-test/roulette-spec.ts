import {expect} from 'chai';
import * as sinon from 'sinon';
import {Randomizer} from "../src/randomizer";
import {Roulette} from "../src/roulette";
import {Waiter} from "../src/waiter";
import {Color} from "../src/roulette-result";

describe('Roulette', () => {
  it('returns a random roulette result', () => {
    let waiter = new Waiter();
    const roulette = new Roulette(waiter, new Randomizer());
    const {number, color} = roulette.play()
    expect(number).greaterThan(-1)
    expect(number).lessThan(37)
    expect(color).instanceOf(Color);
  }).timeout(21000);



});
