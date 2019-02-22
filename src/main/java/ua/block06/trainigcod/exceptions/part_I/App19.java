package ua.block06.trainigcod.exceptions.part_I;

/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class App19 {

    public static void main(String[] args) {
        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
    }
    public static double sqr(double arg) {
        while (true); // Вот тут мы на века "повисли"
    }
}
