package ua.block06.trainigcod.exceptions.part_I;

/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class App12 {

    public double sqr(double arg) { // надо double
        return arg * arg;           // double * double - это double
    }

    public static void main(String[] args) {
        System.out.println(new App12().sqr(2.0));
    }
}
