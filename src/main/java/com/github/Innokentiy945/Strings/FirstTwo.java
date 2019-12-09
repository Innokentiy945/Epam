package com.github.Innokentiy945.Strings;

/*

Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


FirstTwo("Hello") → "lololo"
FirstTwo("ab") → "ababab"
FirstTwo("Hi") → "HiHiHi"
 */


public class FirstTwo {
    public String firstTwo(String str) {
        if(str.length() >= 3)
            return str.substring(0, 2);
        return str;

    }



}
