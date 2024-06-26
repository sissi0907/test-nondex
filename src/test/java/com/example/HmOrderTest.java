package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HmOrderTest {
    @Test
    public void testGetAlphabet() {
        HmOrder order = new HmOrder();
        String alphabet = order.getAlphabet();
        // this can fail because hashmap ordering is not guaranteed
        assertEquals(alphabet, "abcdefghijklmnopqrstuvwxyz");
    }

    @Test
    public void testSomething() {
        assertEquals(3, 1 + 1 + 1);
    }

    @Test
    public void testSomethingElse() {
        assertEquals(4, 2 + 2);
    }

}
