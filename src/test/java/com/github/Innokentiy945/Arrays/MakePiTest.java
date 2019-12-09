package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakePiTest {
    private MakePi makePi = new MakePi();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {
        //When
        boolean expected = false;
        int[] actual = makePi.makePi();

        //Then
        assertTrue(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnOutOfBoundsException() {
        //When
        boolean expected = false;
        int[] actual = makePi.makePi();

        //Then
        assertTrue(expected, actual);
    }

    @Test
    public void shouldReturnRightCount() {
        //Given
        int[] arr = {3,1,4};

        //When
        int expected = arr.length+3;
        int[] actual = makePi.makePi();

        //Then
        assertNotEquals(expected, actual);

    }

}
