<?php


use PHPUnit\Framework\TestCase;

class LeapYearTest extends TestCase
{
    /** @test */
    public function every4YearsIsALeapYear()
    {
        $this->assertTrue($this->isLeapYear(2020));
        $this->assertFalse($this->isLeapYear(2019));
        $this->assertFalse($this->isLeapYear(2018));
        $this->assertFalse($this->isLeapYear(2017));
        $this->assertTrue($this->isLeapYear(2016));
    }

    /** @test */
    public function every100YearsIsNotALeapYear()
    {
        $this->assertFalse($this->isLeapYear(2100));
        $this->assertFalse($this->isLeapYear(2200));
        $this->assertFalse($this->isLeapYear(2300));
        $this->assertFalse($this->isLeapYear(2500));
    }
    /** @test */
    public function every400YearsIsALeapYear()
    {
        $this->assertTrue($this->isLeapYear(1600));
        $this->assertTrue($this->isLeapYear(2000));
        $this->assertTrue($this->isLeapYear(2400));
        $this->assertTrue($this->isLeapYear(2800));
    }


    protected function isLeapYear($year): bool
    {
        $leapyear = new LeapYear();
        $result = $leapyear->isLeap($year);
        return $result;
    }


}
