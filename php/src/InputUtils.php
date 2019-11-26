<?php


class InputUtils
{
    static function containsSpecialChar($password){
        return preg_match('/[\W_]+/', $password, $matches);
    }

    static function greaterThan($password, $length)
    {
        return mb_strlen($password) > $length;
    }

    /**
     * @param $password
     * @return bool
     */
    static function containsNumeric($password): bool
    {
        return preg_match('/[0-9]/', $password, $matches);
    }

    /**
     * @param $password
     * @return false|int
     */
    static function containsAlpha($password)
    {
        return preg_match('/[a-zA-Z]/', $password, $matches);
    }
}