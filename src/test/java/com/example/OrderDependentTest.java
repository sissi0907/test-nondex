package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderDependentTest {
    private static String local = "";

    @Test
    public void testLocalEmptyVictim() {
        assertEquals("", local);
    }

    @Test
    public void testLocalCanBeChangedPolluter() {
        local = "not empty";
        assertEquals("not empty", local);
    }
}
