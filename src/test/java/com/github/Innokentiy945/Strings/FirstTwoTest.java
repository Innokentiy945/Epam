package com.github.Innokentiy945.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTwoTest {
    private FirstTwo firstTwo = new FirstTwo();

    @Test(expected = NullPointerException.class)
    public void ShouldReturnNullPointerExceptionWhenNull() {

        //Given
        String str = null;

        //When
        String expected = null;
        String actual = firstTwo.firstTwo(str);

        //Then
        assertEquals(expected,actual);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void shouldReturnOutOfBoundsException() {
        //Given
        String str = "Apple";

        //When
        String actual = firstTwo.firstTwo(str);
        String expected = str.substring(0, 7);

        //Then
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCharTwo() {
        //Given
        String str = "Apple";

        //When
        String actual = firstTwo.firstTwo(str);
        String expected = str.substring(0, 2);

        //Then
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotReturnCharTwo(){
        //Given
        String str = "eeeee";

        //When
        String actual = firstTwo.firstTwo(str);
        String expected = str.substring(0, 3);

        //Then
        assertNotEquals(actual, expected);
    }

}
