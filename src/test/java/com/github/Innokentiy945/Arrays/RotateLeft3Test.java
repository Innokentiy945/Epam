package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateLeft3Test {
    private RotateLeft3 rotateLeft3 = new RotateLeft3();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] nums = null;


        //When
        int expected = 0;
        int[] actual = rotateLeft3.rotateLeft3(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnOutOfBoundsException() {
        //Given
        int[] nums = {1, 2, 3};
        int[] arr = {};

        //When
        boolean actual = true;
        boolean expected = arr[0] == nums[6];
        boolean expected1 = arr[1] == nums[4];
        boolean expected2 = arr[2] == nums[5];

        //Then
        assertFalse(String.valueOf(actual), expected);
        assertFalse(String.valueOf(actual), expected1);
        assertFalse(String.valueOf(actual), expected2);
    }

    @Test
    public void shouldReturnFalseIfStartingConditionsRight() {
        //Given
        int[] nums = {1, 2, 3};
        int[] arr =  new int[3];

        //When
        boolean actual = false;
        boolean expected = arr[0] == nums[1];
        boolean expected1 = arr[1] == nums[2];
        boolean expected2 = arr[2] == nums[0];

        //Then
        assertFalse(String.valueOf(actual), expected);
        assertFalse(String.valueOf(actual), expected1);
        assertFalse(String.valueOf(actual), expected2);
    }




}
