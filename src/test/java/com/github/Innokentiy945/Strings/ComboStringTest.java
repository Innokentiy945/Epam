package com.github.Innokentiy945.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComboStringTest {

    private ComboString comboString = new ComboString();

    @Test(expected = NullPointerException.class)
    public void shouldReturnNullPointerExceptionWhenNull() {

        //Given
        String a = null;
        String b = null;


        //When
        String expected = null;
        String actual = comboString.comboString(a,b);

        //Then
        assertNotEquals(expected,actual);
    }

    @Test
    public void shouldReturnRightResusltAB1(){
        //Given
        String a = "bb";
        String b = "a";

        //When
        String expected = a+a;
        String actual = comboString.comboString(a,b);

        //Then
        assertNotEquals(expected, actual);
    }

    @Test
    public void shouldReturnRightResultAB2(){
        //Given
        String a = "bb";
        String b = "a";

        //When
        String expected = b+b;
        String actual = comboString.comboString(a,b);

        //Then
        assertNotEquals(expected, actual);
    }
    @Test
    public void shouldNotReturnExpectedResult(){
        //Given
        String a = "bb";
        String b = "a";

        //When
        String expected = "gfhfgdgfsdfsdf";
        String actual = comboString.comboString(a,b);

        //Then
        assertNotEquals(expected, actual);
    }

}
