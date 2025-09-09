package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    public void test(){
        Calc c = new Calc();
        int actual = c.divide(10, 5);
        int expected = 2;
        assertEquals(expected, actual);
    }
}