package Calculadora;

/**
 * Created by ivanm on 01/03/2017.
 */
public class Suma implements Operacion{

    double num1, num2;

    public Suma(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double calculate() {
        return num1+num2;
    }



}
