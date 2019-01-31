const {Roulette} = require ("../../lib/roulette")
const { assert, expect } = require('chai')
var {defineSupportCode, And, But, Given, Then, When} = require('cucumber')

function randomizerReturning(number) {
  return {
    getValue() {
      return number
    }
  }
}

When(/^the randomizer provides (\d+)$/, async function (number) {
  let immediateWaiter = {wait() {}}
  const roulette = new Roulette(immediateWaiter, randomizerReturning(number))
  this.result = await roulette.play();
})
Then(/^the color is (\w+)$/, function (color) {
  expect(this.result).property('color', color)
})

When(/^the ball stops$/, function () {
   // nothing, for readability
});


// defineSupportCode(function ({And, But, Given, Then, When}) {
// });
