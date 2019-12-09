package com.github.Innokentiy945.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComboStringTest {

    ComboString comboString = new ComboString();

    @Test(expected = NullPointerException.class)
    public void ShouldReturnNullPointerExceptionWhenNull() {

        //Given
        String a = null;
        String b = null;


        //When
        boolean expected = false;
        String actual = comboString.comboString(a,b);

        //Then
        assertNotEquals(expected,actual);
    }

    @Test
    public void ShouldReturnRightResusltAB1(){
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
    public void ShouldReturnRightResusltAB2(){
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
    public void ShouldReturnRightResuslt3(){
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