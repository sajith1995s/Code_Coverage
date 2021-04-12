package com.example;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MathDemoTest {
    private Mathdemo mathdemo=new Mathdemo();
    @Test
    public void testAdd() {
        int result = mathdemo.add(5,3);
        assertEquals(result,8);
    }

    @Test
    public void testSubtract() {
        int result = mathdemo.subtract(10,4);
        assertEquals(result,6);
    }
    @Test
    public void testMultification() {
        int result = mathdemo.multify(4,3);
        assertEquals(result,12);
    }
}
