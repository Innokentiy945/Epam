package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sum3Test {
    private Sum3 sum3 = new Sum3();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] nums = null;

        //When
        int expected = 0;
        int actual = sum3.sum3(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnOutOfBoundsException() {
        //Given
        int[] nums = {};

        //When
        int actual = sum3.sum3(nums);
        int expected = nums[0]+nums[1];

        //Then
        assertEquals(expected,actual);

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnOutOfBoundsException2() {
        //Given
        int[] nums = {};

        //When
        int actual = sum3.sum3(nums);
        int expected = nums[4]+nums[5];

        //Then
        assertEquals(expected,actual);

    }
    @Test
    public void shouldReturnRightCount1() {
        //Given
        int[] nums = {2, 1, 2, 3, 4};

        //When
        int expected = 6;
        int actual = sum3.sum3(nums);

        //Then
        assertNotEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCount2() {
        //Given
        int[] nums = {6, 7, 9};

        //When
        int expected = 0;
        int actual = sum3.sum3(nums);

        //Then
        assertNotEquals(expected, actual);
    }


}
