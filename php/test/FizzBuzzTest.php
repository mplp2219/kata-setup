<?php


use PHPUnit\Framework\TestCase;

class FizzBuzzTest extends TestCase
{
    /**
     * @test
     * @dataProvider numberProvider
     * @param int $number
     * @param $expected
     */
    public function testSay(int $number, $expected)
    {
        $fizzBuzz = new FizzBuzz();

        $this->assertEquals($expected, $fizzBuzz->say($number));
    }

    public function numberProvider()
    {
        return [
            'I pass 1' => [1, 1],
            'I pass 2' => [2, 2],
            'I pass 3' => [3, 'Fizz'],
            'I pass 5' => [5, 'Buzz'],
            'I pass 6' => [6, 'Fizz'],
            'I pass 10' => [10, 'Buzz'],
            'I pass 15' => [15, 'FizzBuzz'],
            'I pass 7' => [7, 'Bang'],
            'I pass 21' => [21, 'FizzBang'],
            'I pass 35' => [35, 'BuzzBang'],
            'I pass 105' => [105, 'FizzBuzzBang'],
        ];
    }


}
