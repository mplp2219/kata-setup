<?php


use PHPUnit\Framework\TestCase;

class LeapYearTesdt extends TestCase
{
    /** @test */
    public function returnTrueFor2020()
    {
        $leapyear = new LeapYear();
        $result = $leapyear->isLeap(2020);
        $this->assertTrue($result);
    }




}
