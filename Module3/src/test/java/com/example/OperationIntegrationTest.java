package com.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class OperationIntegrationTest {

    private Calculation c=new Calculation();
    @Test
    public void testCal(){

        double r=c.Simplecal("1",6.0,4.0);
        assertEquals(r,20.0);
    }
}
