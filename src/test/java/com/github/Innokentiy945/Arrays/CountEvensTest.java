package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountEvensTest {
    private CountEvens countEvens = new CountEvens();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] nums = null;

        //When
        int expected = 0;
        int actual = countEvens.countEvens(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightResult1() {
        //Given
        int[] nums = {2, 2, 0};

        //When
        int expected = 3;
        int actual = countEvens.countEvens(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightResult2() {
        //Given
        int[] nums = {5, 7, 8, 9, 1, 4, 0};

        //When
        int expected = 3;
        int actual = countEvens.countEvens(nums);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnResultWhenArrayEmpty(){
        //Given
        int[] nums = {};

        //When
        int expected = 0;
        int actual = countEvens.countEvens(nums);

        //Then
        assertEquals(expected, actual);

    }


}
