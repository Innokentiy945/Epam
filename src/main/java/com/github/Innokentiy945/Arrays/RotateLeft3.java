package com.github.Innokentiy945.Arrays;

public class RotateLeft3 {
    /*

    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


    RotateLeft3([1, 2, 3]) → [2, 3, 1]
    RotateLeft3([5, 11, 9]) → [11, 9, 5]
    RotateLeft3([7, 0, 0]) → [0, 0, 7]
     */
    public int[] rotateLeft3(int[] nums) {
        int[] arr = new int[3];

        arr[0] = nums[1];
        arr[1] = nums[2];
        arr[2] = nums[0];
        return arr;
    }
}
