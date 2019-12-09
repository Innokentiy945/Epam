package com.github.Innokentiy945.Strings;

/*

Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).


ComboString("Hello", "hi") → "hiHellohi"
ComboString("hi", "Hello") → "hiHellohi"
ComboString("aaa", "b") → "baaab"
 */

public class ComboString {
    public String comboString(String a, String b) {
        int La = a.length();
        int Lb = b.length();

        if (La > Lb){
            return b+a+b;
        }
        else{
            return a+b+a;
        }
    }
}
