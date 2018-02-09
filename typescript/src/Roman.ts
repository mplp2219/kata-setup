export class Roman {
≠≠
  public toRoman(numberToConvert: number) {

    let romanDigits: [number, string][] = [
      [10, 'X'],
      [9, 'IX'],
      [5, 'V'],
      [4, 'IV'],
      [1, 'I'],
    ];

    let romanNumber = "";
    romanDigits.forEach(([arabic, romanDigit]) => {
      while (numberToConvert >= arabic) {
        romanNumber += romanDigit;
        numberToConvert -= arabic;
      }
    });
    return romanNumber;
  }
}
