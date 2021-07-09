package one.digitalinnovation.calculadoratest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import one.digitalinnovation.calculadora.Calculadora;

public class CalculadoraTest {
    @Test
    public void testSomar() { 
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5, soma);
    }
}
