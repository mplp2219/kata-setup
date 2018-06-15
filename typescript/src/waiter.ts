export class Waiter {

  constructor(private timeInMillis: number) {
  }

  wait(): Promise<void> {
    return new Promise((resolve, reject) => {
      setTimeout(resolve, this.timeInMillis);
    })
  }
}
