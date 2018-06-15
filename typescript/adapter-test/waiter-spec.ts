import {Waiter} from "../src/waiter";
import {expect} from "chai";

describe('Waiter', () => {
  it('waits for 20 seconds by default', async () => {
    const waiter = new Waiter()
    const before = Date.now()
    await waiter.wait();
    const after = Date.now()
    expect(after - before).approximately(20000, 5)
  }).timeout(21000);

});
