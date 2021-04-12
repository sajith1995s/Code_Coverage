package com.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MathIntegrationTest {
    private MathCalculation c=new MathCalculation();
    @Test
    public void testlogic() {
        int result=c.Cal(5,4);
        assertEquals(result,10);
    }

}
