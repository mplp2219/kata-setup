import {expect} from 'chai';
import * as sinon from 'sinon';
import {Randomizer} from "../src/randomizer";
import {Roulette} from "../src/roulette";
import {Waiter} from "../src/waiter";
import {RouletteResult} from "../src/roulette-result";

describe('Roulette', () => {

  it('creates a RouletteResult with the data from the randomizer after waiting', () => {
    let waiter = {wait: sinon.spy()};
    let randomizer = {getValue: sinon.stub().returns(0)};
    const roulette = new Roulette(waiter as Waiter, randomizer);

    const result = roulette.play()

    expect(result).eql(new RouletteResult(0))
    sinon.assert.calledOnce(waiter.wait)
  });

  it('creates a RouletteResult with the data from the randomizer after waiting', () => {
    let waiter = {wait: sinon.spy()};
    let randomizer = {getValue: sinon.stub().returns(37)};
    const roulette = new Roulette(waiter as Waiter, randomizer);

    const result = roulette.play()

    expect(result).eql(new RouletteResult(37))
    sinon.assert.calledOnce(waiter.wait)
  });



});
