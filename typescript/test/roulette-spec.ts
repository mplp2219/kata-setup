import {expect} from 'chai';
import * as sinon from 'sinon';
import {Randomizer} from "../src/randomizer";
import {Roulette} from "../src/roulette";
import {Waiter} from "../src/waiter";
import {RouletteResult} from "../src/roulette-result";

describe('Roulette', () => {
  it('returns a random roulette result', () => {
    let waiter = {wait: sinon.spy()};
    let randomizer = {getValue: sinon.stub().returns(0)};
    const roulette = new Roulette(waiter as Waiter, randomizer);
    const result = roulette.play()
    expect(result).eql(new RouletteResult(0))
    sinon.assert.calledOnce(waiter.wait)
  });



});
