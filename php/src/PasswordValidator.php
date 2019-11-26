<?php


class PasswordValidator
{

    protected function ContainsAlphaNumAndMinLenght($password, $lenght){
        if (!$this->greaterThan($password, $lenght)) {
            return false;
        }
        if (!$this->containsNumeric($password)) {
            return false;
        }
        if (!$this->containsAlpha($password)) {
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

        if(!$this->containsSpecialChar($password)) {
            return false;
        }

        return true;
    }

    protected function containsSpecialChar($password){
        return preg_match('/[\W_]+/', $password, $matches);
    }

    protected function greaterThan($password, $length)
    {
        return mb_strlen($password) > $length;
    }

    /**
     * @param $password
     * @return bool
     */
    protected function containsNumeric($password): bool
    {
        return preg_match('/[0-9]/', $password, $matches);
    }

    /**
     * @param $password
     * @return false|int
     */
    protected function containsAlpha($password)
    {
        return preg_match('/[a-zA-Z]/', $password, $matches);
    }


}