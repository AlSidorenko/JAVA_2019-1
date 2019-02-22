package ua.block06.trainigcod.exceptions.part_I;

/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class App25 {

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            System.out.println("Bad ...");
        }
        return width * height;
    }
}
