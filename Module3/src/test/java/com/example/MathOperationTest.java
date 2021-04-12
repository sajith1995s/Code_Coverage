package com.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class MathOperationTest {
    @Test
    public void testDoMath() {

        MathOperation calc = new MathOperation();

        assertTrue(calc.doMath("1", 5, 7) == 12.0);
        assertTrue(calc.doMath("2", 5, 7) == -2.0);
        assertTrue(calc.doMath("3", 5, 7) == (5.0/7.0));
        assertTrue(calc.doMath("4", 5, 7) == (5.0*7.0));
    }

}
