package uff.qet.aula1;

public class Factorial {
    /**
     * Calcula o fatorial de um número recursivamente
     * @param n: int, fatorial a ser calculado
     * @return fatorial
     */
    public static int recursiveFactorial(int n) {
        if(n < 0) throw new IllegalArgumentException("Number should be 0 or bigger.");
        /* if (n == 1 || n == 0), return 1 */
        if (n <= 1) return 1;
        return n * recursiveFactorial(n - 1);
    }

    /**
     * Calcula o fatorial de um número iterativamente
     * @param n: int, fatorial a ser calculado
     * @return fatorial
     */
    public static int iterativeFactorial(int n) {
        int finalValue = 1;
        if (n < 0) throw new IllegalArgumentException("Number should be 0 or bigger.");
        else if (n <= 1) return 1;
        for (int i = 1; i <= n; i++) finalValue *= i;
        return finalValue;
    }
}
