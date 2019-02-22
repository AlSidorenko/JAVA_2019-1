package ua.block06.trainigcod.exceptions.part_II;

import java.io.EOFException;
import java.io.FileNotFoundException;

/**
 * Created on 22.02.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class App12 {

    // пугаем ОБОИМИ исключениями
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        f0();
        f1();
    }

    public static void f0() throws EOFException {
        //...
    }

    public static void f1() throws FileNotFoundException {
        //...
    }
}
