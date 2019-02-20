package ua.class1402;

/**
 * Created on 19.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CalcFinal {

    public void calc(final double x, double y) {
        System.out.printf("Result = %s", x + y);
    }

    public static void main(String[] args) {
        new CalcFinal().calc(5.0, 7.0);
    }
}
