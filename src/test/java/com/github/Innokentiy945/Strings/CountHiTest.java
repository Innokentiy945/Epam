package com.github.Innokentiy945.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountHiTest {
    private CountHi countHi = new CountHi();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {

        //Given
        String str = null;

        //When
        int expected = 0;
        int actual = countHi.countHi(str);

        //Then
        assertEquals(expected,actual);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void shouldReturnOutOfBoundsException() {
        //Given
        String str = "hihi";

        //When
        int expected = 4;
        int actual = countHi.countHi(str.substring(0,2));

        //Then
        assertNotEquals(expected, actual);
    }

    @Test
    public void shouldReturnZeroHi() {
        //Given
        String str = "";

        //When
        int expected = 0;
        int actual = countHi.countHi(str);

        //Then
        assertEquals(expected, actual);
    }
}
