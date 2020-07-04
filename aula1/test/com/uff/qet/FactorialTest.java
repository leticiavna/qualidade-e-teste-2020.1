package com.uff.qet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes para os métodos da classe Fatorial.
 * Os valores testados são os mesmos nos testes, pois é preciso que os resultados calculados
 * pelos dois métodos sejam iguais (já que são implementados de forma diferente)
 * 
 */
class FactorialTest {

    /**
     * Testa se os valores passados retornam o resultado esperado, após cálculo recursivo
     * Aqui é testado as condições de base (0 e 1) e outros valores
     */
    @Test
    public void testRecursiveFactorialEquals() throws Exception {
        assertEquals(1, Factorial.recursiveFactorial(0));
        assertEquals(1, Factorial.recursiveFactorial(1));
        assertEquals(2, Factorial.recursiveFactorial(2));
        assertEquals(120, Factorial.recursiveFactorial(5));
        assertEquals(2004310016, Factorial.recursiveFactorial(15));
    }

    /**
     * Testa se o erro mapeado no método é lançado quando há a entrada de um parâmetro incorreto
     */
    @Test
    public void testRecursiveFactorialThrowError() throws Exception {
        assertThrows(IllegalArgumentException.class, ()-> { Factorial.recursiveFactorial(-2); });
    }

    /**
     * Testa se os valores passados retornam o resultado esperado, após cálculo iterativo
     * Aqui é testado as condições de base (0 e 1) e outros valores
     */
    @Test
    public void testIterativeFactorial() throws Exception {
        assertEquals(1, Factorial.iterativeFactorial(0));
        assertEquals(1, Factorial.iterativeFactorial(1));
        assertEquals(2, Factorial.iterativeFactorial(2));
        assertEquals(120, Factorial.iterativeFactorial(5));
        assertEquals(2004310016, Factorial.iterativeFactorial(15));
    }

    /**
     * Testa se o erro mapeado no método é lançado quando há a entrada de um parâmetro incorreto
     */
    @Test
    public void testIterativeFactorialThrowError() throws Exception {
        assertThrows(IllegalArgumentException.class, ()-> { Factorial.iterativeFactorial(-2); });
    }

}
