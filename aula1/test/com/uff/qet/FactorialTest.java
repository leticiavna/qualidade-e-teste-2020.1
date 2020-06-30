package com.uff.qet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void testRecursiveFactorialEquals() throws Exception {
        assertEquals(1, Factorial.recursiveFactorial(0));
        assertEquals(1, Factorial.recursiveFactorial(1));
        assertEquals(2, Factorial.recursiveFactorial(2));
        assertEquals(120, Factorial.recursiveFactorial(5));
        assertEquals(3628800, Factorial.recursiveFactorial(10));
    }

    @Test
    public void testRecursiveFactorialThrowError() throws Exception {
        assertThrows(IllegalArgumentException.class, ()-> { Factorial.recursiveFactorial(-2); });
    }
}