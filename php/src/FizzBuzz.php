<?php


class FizzBuzz
{


    public function say($number)
    {
        $result = "";
        if ($this->isDivisibleBy($number, 3)) {
            $result.= "Fizz";
        }
        if ($this->isDivisibleBy($number, 5)) {
            $result.= "Buzz";
        }
        if ($this->isDivisibleBy($number, 7)) {
            $result.= "Bang";
        }
        return empty($result)? $number : $result;

    }

    private function isDivisibleBy($number, $diviser) {

        return $number % $diviser === 0;

    }
}