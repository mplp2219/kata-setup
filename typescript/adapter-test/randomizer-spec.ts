import {Randomizer} from "../src/randomizer";
import * as _ from 'lodash';
import {expect} from "chai";

describe('Randomizer', () => {
  const randomizer = new Randomizer();

  it('always generates a value between 0 and 37 inclusive', () => {
    const values = _.times(10000, i => randomizer.getValue());
    expect(_.min(values)).gte(0);
    expect(_.max(values)).lte(37)
  });

  it('generates all values in the range', () => {
    const values = _.times(10000, i => randomizer.getValue());
    expect(_.uniq(values)).length(38)
  });


});
