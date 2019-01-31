Feature: The roulette has colors
  In order to play on something different than numbers
  As a croupier
  I want to have colors on every number

  Scenario: There are red, black and green
    Given the randomizer provides 1
    When the ball stops
    Then the color is black

  Scenario Outline: 0 and 00 are the only green ones
    Given the randomizer provides <number>
    When the ball stops
    Then the color is green

    Examples:
      | number |
      | 0      |

