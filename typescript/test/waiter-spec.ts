import {Waiter} from "../src/waiter";
import {expect} from "chai";

describe('Waiter', () => {
  it('waits for the given amount of milliseconds before returning', async () => {
    const waiter = new Waiter(50)
    const before = Date.now()
    await waiter.wait();
    const after = Date.now()
    expect(after - before).approximately(50, 5)
  });

});
