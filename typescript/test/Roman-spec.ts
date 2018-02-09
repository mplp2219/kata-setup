import {assert} from "chai";
import {Roman} from "../src/Roman";

function toRoman(arabic: number) {
  return new Roman().toRoman(arabic);
}

describe('RomanNumbers', () => {
  describe('toRoman() is', () => {

    function assertRomanIs(arabic: number, expected: string) {
      assert.equal(toRoman(arabic), expected);
    }

    it('I for 1', () => {
      assertRomanIs(1, 'I');
    });

    it('II for 2', () => {
      assertRomanIs(2, 'II');
    });

    it('is III for 3', () => {
      assertRomanIs(3, 'III');
    });

    it('is IV for 4', () => {
      assertRomanIs(4, 'IV');
    });

    it('adds V for numbers between 8 and 5', () => {
      assertRomanIs(5, 'V')
      assertRomanIs(6, 'VI');
      assertRomanIs(7, 'VII');
      assertRomanIs(8, 'VIII');
    });

    it('is IX for 9', () => {
      assertRomanIs(9, 'IX');
    });

    it('adds X for numbers between 19 and 10', () => {
      assertRomanIs(10, 'X');
      assertRomanIs(11, 'XI');
    });

  });
});

