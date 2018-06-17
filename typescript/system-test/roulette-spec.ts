import {expect} from 'chai';
import {createRouletteApplication} from "../src";

describe('Roulette application', () => {
  it('returns a roulette result after some time', async () => {
    const roulette = createRouletteApplication();
    const rouletteResult = await roulette.play()
    expect(rouletteResult.number).gte(0)
    expect(rouletteResult.number).lte(37)
    expect(['red', 'black', 'green']).includes(rouletteResult.color);
  }).timeout(21000);



});
