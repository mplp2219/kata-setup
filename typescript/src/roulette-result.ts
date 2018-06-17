export enum Color {
  Black = 'black',
  Green = 'green',
  Red = 'red'

}

export class RouletteResult {
  public readonly color: Color;

  constructor(public readonly number: number) {
    this.color = this.calculateColor(number);
  }

  private calculateColor(number): Color {
    if (number === 0 || number === 38) {
      return Color.Green
    } else if (number % 2 === 0) {
      return Color.Red
    } else {
      return Color.Black
    }
  }
}
