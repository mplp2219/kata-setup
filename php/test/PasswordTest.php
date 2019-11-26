<?php


use PHPUnit\Framework\TestCase;

class PasswordTest extends TestCase
{

    public function testValidatePassword(){

        $passwordValidator = new PasswordValidator();
        $this->assertFalse($passwordValidator->validate('123456'));
        $this->assertFalse($passwordValidator->validate('1234567'));
        $this->assertFalse($passwordValidator->validate('abcdefg'));
        $this->assertFalse($passwordValidator->validate('abc123'));
        $this->assertTrue($passwordValidator->validate('abc1234'));
        $this->assertTrue($passwordValidator->validate('ABC1234'));
    }

    /**
     *
     */
    public function testValidateAdminPassword()
    {
        $passwordValidator = new PasswordValidator();
        $this->assertFalse($passwordValidator->validateAdmin('0123456789'));
        $this->assertFalse($passwordValidator->validateAdmin('012345678910'));
        $this->assertFalse($passwordValidator->validateAdmin('abcdefghijklm'));
        $this->assertFalse($passwordValidator->validateAdmin('@@@@@@@@@@@@'));
        $this->assertFalse($passwordValidator->validateAdmin('0123456abcde'));
        $this->assertTrue($passwordValidator->validateAdmin('0123456@bcde'));
        $this->assertTrue($passwordValidator->validateAdmin('0123456bcde_'));
        $this->assertTrue($passwordValidator->validateAdmin('0123456bcde_'));

    }
}
