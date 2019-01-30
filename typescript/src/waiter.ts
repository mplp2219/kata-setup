export class Waiter {

  constructor(private timeInMillis: number = 20000) {
  }

  wait(): Promise<void> {
    return new Promise((resolve, reject) => {
      setTimeout(resolve, this.timeInMillis);
    })
  }
}
