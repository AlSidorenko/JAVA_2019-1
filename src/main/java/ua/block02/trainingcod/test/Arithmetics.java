package ua.block02.trainingcod.test;

/**
 * Created on 12.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Arithmetics {

    public double add(double a, double b) {
        return a + b;
    }

    public double deduct(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }
}
