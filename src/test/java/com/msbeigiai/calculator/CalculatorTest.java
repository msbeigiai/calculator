package com.msbeigiai.calculator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;


    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}
