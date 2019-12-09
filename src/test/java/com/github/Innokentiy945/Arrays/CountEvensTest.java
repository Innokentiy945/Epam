package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountEvensTest {
    CountEvens countEvens = new CountEvens();

    @Test(expected = NullPointerException.class)
    public void ShouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] nums = null;

        //When
        boolean expected = false;
        int actual = countEvens.countEvens(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void ShouldReturnOutOfBoundsException() {
        //Given
        int[] nums = {};

        //When
        boolean expected = false;
        int actual = countEvens.countEvens(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnRightResult1() {
        //Given
        int[] nums = {2, 2, 0};

        //When
        int expected = 3;
        int actual = countEvens.countEvens(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnRightResult2() {
        //Given
        int[] nums = {5, 7, 8, 9, 1, 4, 0};

        //When
        int expected = 3;
        int actual = countEvens.countEvens(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnResultWhenArrayEmpty(){
        //Given
        int[] nums = {};

        //When
        int expected = 0;
        int actual = countEvens.countEvens(nums);

        //Then
        assertEquals(expected, actual);

    }


}