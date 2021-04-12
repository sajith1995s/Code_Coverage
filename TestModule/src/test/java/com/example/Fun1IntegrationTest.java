package com.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Fun1IntegrationTest {
@Test
    public void testlogic(){
        MathCalculation1 m1=new MathCalculation1();
        assertEquals(m1.Cal1(4,3),13);
    }

}
