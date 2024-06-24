package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HmOrderTest {
    @Test
    public void testGetAlphabet() {
        HmOrder order = new HmOrder();
        String alphabet = order.getAlphabet();
        assertEquals(alphabet, "abcdefghijklmnopqrstuvwxyz");
    }
}
