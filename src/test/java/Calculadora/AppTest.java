package Calculadora;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSumaOk()
    {
        Suma sum = new Suma(10,10);
        Assert.assertTrue( sum.calculate() == 20);
    }
    public void testSumaFail(){
        Suma sum2 = new Suma(10,10);
        Assert.assertFalse(sum2.calculate() != 20);
    }
    public void testRestaOK(){
        Assert.assertTrue(new Resta(10,5).calculate() == 5);
    }
    public void testRestaFail(){
        Assert.assertFalse(new Resta(10,5).calculate() != 5);
    }
    public void testMultiplicacionOK(){
        double resultadoReal = new Multiplicacion(3,5).calculate();
        double resultadoEsperado = 15;
        Assert.assertEquals(resultadoEsperado,resultadoReal);
    }
    public void testMultiplicacionFail(){
        double resultadoReal = new Resta(5,3).calculate();
        double resultadoEsperado = 15;
        Assert.assertNotSame(resultadoEsperado,resultadoReal);
    }
    public void testDivisionOK(){
        Assert.assertTrue(new Division(6,3).calculate() == 2);
    }
    public void testDivisionFail(){
        Assert.assertFalse(new Division(6,3).calculate() != 2);
    }
}
