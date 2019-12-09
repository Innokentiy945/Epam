package com.github.Innokentiy945.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakePiTest {
    MakePi makePi = new MakePi();

    @Test(expected = NullPointerException.class)
    public void ShouldReturnNullPointerExceptionWhenNull() {
        //When
        boolean expected = false;
        int[] actual = makePi.makePi();

        //Then
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void ShouldReturnOutOfBoundsException() {
        //When
        boolean expected = false;
        int[] actual = makePi.makePi();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnRightCount() {
        //Given
        int[] arr = {3,1,4};

        //When
        int expected = arr.length+3;
        int[] actual = makePi.makePi();

        //Then
        assertNotEquals(expected, actual);

    }

}