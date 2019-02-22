package ua.block06.trainigcod.exceptions.part_I;

/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class App23 {

    public static void main(String[] args) {
        // sqr - "сломается" (из него "выскочит" исключение),
        double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
        System.out.println(d); // и печатать нам ничего не придется!
    }
    public static double sqr(double arg) {
        throw new RuntimeException(); // "бросаем" исключение
    }
}
