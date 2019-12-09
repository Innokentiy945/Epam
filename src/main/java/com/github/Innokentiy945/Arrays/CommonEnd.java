package com.github.Innokentiy945.Arrays;

public class CommonEnd {
    /*

    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
    Both arrays will be length 1 or more.


    CommonEnd([1, 2, 3], [7, 3]) → true
    CommonEnd([1, 2, 3], [7, 3, 2]) → false
    CommonEnd([1, 2, 3], [1, 3]) → tru
     */


    public boolean CommonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}
