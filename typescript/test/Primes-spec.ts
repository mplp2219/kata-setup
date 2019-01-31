import {assert, expect} from 'chai';
import {Primes} from "../src/Primes"

describe('Primes', () => {
  let primes: Primes

  beforeEach(function () {
    primes = new Primes()

  });

  it('numbers below 2 have no prime factors', () => {
    expect(primes.factorsOf(-2)).empty
    expect(primes.factorsOf(0)).empty
    expect(primes.factorsOf(1)).empty
  });

  it('power n of 2 contains the prime 2, n times', () => {
    expect(primes.factorsOf(2)).eql([2])
    expect(primes.factorsOf(4)).eql([2, 2])
    expect(primes.factorsOf(8)).eql([2, 2, 2])
  });

  it('power n of 3 contains the prime 3, n times', () => {
    expect(primes.factorsOf(3)).eql([3])
    expect(primes.factorsOf(9)).eql([3, 3])
    expect(primes.factorsOf(27)).eql([3, 3, 3])
  });

  it('power n of 5 contains the prime 5, n times', () => {
    expect(primes.factorsOf(5)).eql([5])
    expect(primes.factorsOf(25)).eql([5, 5])
    expect(primes.factorsOf(125)).eql([5, 5, 5])
  });

  it('power n of 7 contains the prime 7, n times', () => {
    expect(primes.factorsOf(7)).eql([7])
    expect(primes.factorsOf(49)).eql([7, 7])
    expect(primes.factorsOf(7 * 7 * 7)).eql([7, 7, 7])
  });

  it('factors of 12 are 2, 2, 3', () => {
      expect(primes.factorsOf(12)).eql([2, 2, 3])
  });



  // TODO make sure we there is no bug with number being decreased within addFactorsOF

  it('works for big numbers', () => {
    expect(primes.factorsOf(2 * 3 * 3 * 7 * 7 * 37 * 37)).eql([2, 3, 3, 7, 7, 37, 37])
  });


});
