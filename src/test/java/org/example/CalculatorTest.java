package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Alvaro
 * @created 10/11/2026
 */


public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    public void testSquare(){
        System.out.println("square algorithm test");
        assertEquals(4,calculator.square(2));
    }
}

