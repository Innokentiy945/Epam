package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonEndTest {
    CommonEnd commonEnd = new CommonEnd();

    @Test(expected = NullPointerException.class)
    public void ShouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] a = null;
        int[] b = null;

        //When
        boolean expected = false;
        boolean actual = commonEnd.CommonEnd(a,b);

        //Then
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void ShouldReturnOutOfBoundsException() {
        //Given
        int[] a = {};
        int[] b = {};

        //When
        boolean actual = commonEnd.CommonEnd(a,b);
        boolean expected = false;

        //Then
        assertNotEquals(actual, expected);
    }

    @Test
    public void ShouldReturnTrueWhenFirstElementEquals() {
        //Given
        int[] a = {1, 2, 3};
        int[] b = {1, 5};

        //When
        boolean actual = commonEnd.CommonEnd(a,b);
        boolean expected = a[0] == b[0];

        //Then
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturnFalseWhenLastElementEquals() {
        //Given
        int[] a = {1, 2, 3};
        int[] b = {1, 3};

        //When
        boolean actual = commonEnd.CommonEnd(a,b);
        boolean expected = false;

        //Then
        assertEquals(actual, expected);
    }


}