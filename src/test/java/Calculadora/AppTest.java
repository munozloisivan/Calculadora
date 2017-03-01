package Calculadora;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @org.junit.Test
    public void testSumaOk()
    {
        Suma sum = new Suma(10,10);
        assertTrue( sum.calculate() == 20);
    }
    @Test
    public void testSumaFail(){
        Suma sum2 = new Suma(10,10);
        assertFalse(sum2.calculate() != 20);
    }
    @Test
    public void testRestaOK(){
        assertTrue(new Resta(10,5).calculate() == 5);
    }
    @Test
    public void testRestaFail(){
        assertFalse(new Resta(10,5).calculate() != 5);
    }
    @Test
    public void testMultiplicacionOK(){
        double resultadoReal = new Multiplicacion(3,5).calculate();
        double resultadoEsperado = 15;
        assertEquals(resultadoEsperado,resultadoReal);
    }
    @Test
    public void testMultiplicacionFail(){
        double resultadoReal = new Resta(5,3).calculate();
        double resultadoEsperado = 15;
        assertNotSame(resultadoEsperado,resultadoReal);
    }
    @Test
    public void testDivisionOK(){
        assertTrue(new Division(6,3).calculate() == 2);
    }
    @Test
    public void testDivisionFail(){
        assertFalse(new Division(6,3).calculate() != 2);
    }
}
