<?php


class LeapYear
{


    public function isLeap(int $year)
    {
        if ($this->isDivisibleBy($year, 400)) {
            return true;
        }
        if ($this->isDivisibleBy($year, 100)) {
            return false;
        }
        return $this->isDivisibleBy($year, 4);
    }

    private function isDivisibleBy(int $year, $divisor): bool
    {
        return $year % $divisor == 0;
    }
}