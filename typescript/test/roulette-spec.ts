import {expect} from 'chai';
import * as sinon from 'sinon';
import {Randomizer} from "../src/randomizer";
import {Roulette} from "../src/roulette";
import {Waiter} from "../src/waiter";

describe('Roulette', () => {
  it('returns a random roulette result', () => {
    let waiter = {wait: sinon.spy()};
    const roulette = new Roulette(waiter as Waiter, new Randomizer());
    const result = roulette.play()
    expect(result).greaterThan(-1)
    expect(result).lessThan(37)
    sinon.assert.calledOnce(waiter.wait)
  });

});
