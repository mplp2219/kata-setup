import {Color} from "../src/roulette-result";
import {expect} from "chai";
import {RouletteResult} from "../src/roulette-result";

describe('RouletteResult', () => {
  it('translates 0 and 38 into green', () => {
    expect(new RouletteResult(0)).include({color: Color.Green, number: 0})
    expect(new RouletteResult(38)).include({color: Color.Green, number: 38})
  });

  const evenIsRed = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36]
  evenIsRed.forEach(number => {
    it('translates even numbers into red: ' + number, () => {
      expect(new RouletteResult(number)).include({color: Color.Red, number})
    });

  })
  const oddIsBlack = [ 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35]
  oddIsBlack.forEach(number => {
    it('translates odd numbers into black: ' + number, () => {

      expect(new RouletteResult(number)).include({color: Color.Black, number})
    });

  })


});
