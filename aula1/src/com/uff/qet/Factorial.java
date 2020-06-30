package com.uff.qet;

public class Factorial {
    public static long recursiveFactorial(long n) {
        if(n < 0) throw new IllegalArgumentException("Number should be 0 or bigger.");
        /* if (n == 1 || n == 0), return 1 */
        if (n <= 1) return 1;
        final long l = n * recursiveFactorial(n - 1);
        return l;
    }
}
