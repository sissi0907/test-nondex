package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OtherTest {
    @Test
    public void someOtherTest() {
        assertTrue(true);
        assertEquals(2, 1 + 1);
    }

    @Test
    public void anotherTest() {
        assertTrue(!false);
    }

    @Test
    public void randomlyFail() {
        // fail 10% of the time
        assertTrue(Math.random() > 0.1);
    }
}
