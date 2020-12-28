package com.example.loginapp;

public class LoginUtils {
    public static String isValidPassword(String inputPassword)
    {
        if (inputPassword.length() < 8)
        {
            return "The provided password is too short";
        }
        if (inputPassword.trim().length() < 1)
        {
            return "The provided password is invalid";
        }

        return null;
    }

    public static Boolean isValidEmail(String inputEmail)
    {
        String[] emailParts = inputEmail.split("@");

        if ( (emailParts.length != 2) || (emailParts[0].length() < 1) || (emailParts[1].length() < 3) || (emailParts[1].indexOf('.') < 0) )
        {
            return false;
        }

        return true;
    }

}
