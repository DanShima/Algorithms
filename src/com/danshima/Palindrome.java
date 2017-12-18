package com.danshima;

public class Palindrome {
    public static boolean isPalindrome(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        String reversedString = stringBuilder.toString();
        if(string.equals(reversedString)){
            return true;
        } else {
            return false;
        }
    }

    //alternative method
    public static boolean isPal(String s)
    {   // if length is 0 or 1 then String is palindrome
        if(s.length() <= 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
        //check for first and last char of String:

            return isPal(s.substring(1, s.length()-1));
        //not a palindrome
        return false;
    }

}
