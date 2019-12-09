package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sum67Test {
    private Sum67 sum67 = new Sum67();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] nums = null;

        //When
        int expected = 0;
        int actual = sum67.sum67(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnOutOfBoundsException() {
        //Given
        int[] nums = {};

        //When
        int actual = sum67.sum67(nums);
        int expected = nums[0]+nums[1];

        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnRightCount1() {
        //Given
        int[] nums = {8, 4, 1, 5, 9, 7};

        //When
        int expected = 1;
        int actual = sum67.sum67(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightCount2() {
        //Given
        int[] nums = {6, 7, 9};

        //When
        int expected = 0;
        int actual = sum67.sum67(nums);

        //Then
        assertEquals(expected, actual);
    }
}
