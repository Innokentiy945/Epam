package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateLeft3Test {
    RotateLeft3 rotateLeft3 = new RotateLeft3();

    @Test(expected = NullPointerException.class)
    public void ShouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] nums = null;


        //When
        boolean expected = false;
        int[] actual = rotateLeft3.rotateLeft3(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void ShouldReturnOutOfBoundsException() {
        //Given
        int[] nums = {1, 2, 3};
        int[] arr = {};

        //When
        int[] actual = rotateLeft3.rotateLeft3(nums);
        boolean expected = arr[0] == nums[6];
        boolean expected1 = arr[1] == nums[4];
        boolean expected2 = arr[2] == nums[5];

        //Then
        assertNotEquals(actual, expected);
        assertNotEquals(actual, expected1);
        assertNotEquals(actual, expected2);
    }

    @Test
    public void ShouldReturnFalseIfStartingConditionsRight() {
        //Given
        int[] nums = {1, 2, 3};
        int[] arr =  new int[3];

        //When
        boolean actual = false;
        boolean expected = arr[0] == nums[1];
        boolean expected1 = arr[1] == nums[2];
        boolean expected2 = arr[2] == nums[0];

        //Then
        assertEquals(actual, expected);
        assertEquals(actual, expected1);
        assertEquals(actual, expected2);
    }




}