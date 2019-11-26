<?php


class PasswordValidator
{

    protected function ContainsAlphaNumAndMinLenght($password, $lenght){
        if (!InputUtils::greaterThan($password, $lenght)) {
            return false;
        }
        if (!InputUtils::containsNumeric($password)) {
            return false;
        }
        if (!InputUtils::containsAlpha($password)) {
            return false;
        }
        return true;
    }

    public function validate($password)
    {
        return $this->ContainsAlphaNumAndMinLenght($password, 6);
    }

    public function validateAdmin($password)
    {
        if (!$this->ContainsAlphaNumAndMinLenght($password, 10)){
            return false;
        }

        if(!InputUtils::containsSpecialChar($password)) {
            return false;
        }

        return true;
    }








}