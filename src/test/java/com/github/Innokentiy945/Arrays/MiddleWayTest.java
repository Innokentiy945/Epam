package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleWayTest {
    MiddleWay middleWay = new MiddleWay();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] a = null;
        int[] b = null;

        //When
        boolean expected = false;
        int[] actual = middleWay.middleWay(a,b);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightLengthOfArrays() {
        //Given
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        //When
        int expected = a.length;
        int expected1 = b.length;
        int[] actual = middleWay.middleWay(a,b);

        //Then
        assertNotEquals(actual, expected);
        assertNotEquals(actual, expected1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnRightCount() {
        //Given
        int[] a = {1, 2, 3};
        int[] b = {6, 7, 8};
        int[] arr = {};

        //When
        int[] actual = middleWay.middleWay(a,b);
        boolean expected = arr[0] == a[(a.length) / 3];
        boolean expected1 = arr[1] == b[(b.length) / 3];

        //Then
        assertNotEquals(actual, expected);
        assertNotEquals(actual, expected1);
    }


}
