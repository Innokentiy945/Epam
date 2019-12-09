package com.github.Innokentiy945.Strings;

/*
Return the number of times that the string "hi" appears anywhere in the given string.


CountHi("abc hi ho") → 1
CountHi("ABChi hi") → 2
CountHi("hihi") → 2
 */


public class CountHi {
    public int countHi(String str) {
        int iter = 0;
        for(int i = 0;i<str.length();i++){
            if(str.substring(i, i + 2).equals("hi")){
                iter++;
            }

        }
        return iter;
    }
}
