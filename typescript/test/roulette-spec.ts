import {expect} from 'chai';
import * as sinon from 'sinon';
import {Randomizer} from "../src/randomizer";
import {Roulette} from "../src/roulette";
import {Waiter} from "../src/waiter";
import {RouletteResult} from "../src/roulette-result";

describe('Roulette', () => {

  it('creates a RouletteResult with the data from the randomizer after waiting', async () => {
    let waiter = {wait: sinon.stub().resolves()};
    let randomizer = {getValue: sinon.stub().returns(11)};
    const roulette = new Roulette(waiter as Waiter, randomizer);

    const result = await roulette.play()

    expect(result).eql(new RouletteResult(11))
    sinon.assert.calledOnce(waiter.wait)
  });


});
