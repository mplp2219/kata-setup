
export class Primes {
  factorsOf(number: number) {
    const factors = []

    number = this.addFactorsOf(2, number, factors)
    for (let prime = 3; prime <= number; prime += 2) {
      number = this.addFactorsOf(prime, number, factors)
    }

    return factors

  }

  private addFactorsOf(prime: number, number: number, factors) {
    while (number % prime === 0 && number >= prime) {
      factors.push(prime)
      number /= prime
    }
    return number

  }
}
