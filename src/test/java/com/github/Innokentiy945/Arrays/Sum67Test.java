package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class Sum67Test {
    Sum67 sum67 = new Sum67();

    @Test(expected = NullPointerException.class)
    public void ShouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] nums = null;

        //When
        boolean expected = false;
        int actual = sum67.sum67(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void ShouldReturnOutOfBoundsException() {
        //Given
        int[] nums = {};

        //When
        int actual = sum67.sum67(nums);
        int expected = nums[0]+nums[1];

        //Then
        assertEquals(expected,actual);
    }

    @Test
    public void ShouldReturnRightCount1() {
        //Given
        int[] nums = {8, 4, 1, 5, 9, 7};

        //When
        int expected = 1;
        int actual = sum67.sum67(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnRightCount2() {
        //Given
        int[] nums = {6, 7, 9};

        //When
        int expected = 0;
        int actual = sum67.sum67(nums);

        //Then
        assertEquals(expected, actual);
    }
}