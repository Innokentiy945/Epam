package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonEndTest {
    private CommonEnd commonEnd = new CommonEnd();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] a = null;
        int[] b = null;

        //When
        boolean expected = false;
        boolean actual = commonEnd.CommonEnd(a,b);

        //Then
        assertTrue(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnOutOfBoundsException() {
        //Given
        int[] a = {};
        int[] b = {};

        //When
        boolean actual = commonEnd.CommonEnd(a,b);
        boolean expected = false;

        //Then
        assertFalse(actual, expected);
    }

    @Test
    public void shouldReturnTrueWhenFirstElementEquals() {
        //Given
        int[] a = {1, 2, 3};
        int[] b = {1, 5};

        //When
        boolean actual = commonEnd.CommonEnd(a,b);
        boolean expected = a[0] == b[0];

        //Then
        assertTrue(actual, expected);
    }

    @Test
    public void shouldReturnFalseWhenLastElementEquals() {
        //Given
        int[] a = {1, 2, 3};
        int[] b = {1, 3};

        //When
        boolean actual = commonEnd.CommonEnd(a,b);
        boolean expected = false;

        //Then
        assertTrue(actual, expected);
    }


}
