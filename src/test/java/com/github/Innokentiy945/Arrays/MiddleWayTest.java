package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleWayTest {
    private MiddleWay middleWay = new MiddleWay();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {
        //Given
        int[] a = null;
        int[] b = null;

        //When
        int expected = 0;
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

        //When
        int[] actual = middleWay.middleWay(a,b);
        int expected = a.length-1;
        int expected1 = b.length-1;


        //Then
        assertEquals(actual, expected);
        assertEquals(actual, expected1);
    }


}
