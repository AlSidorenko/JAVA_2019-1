package ua.blockj08.trainigcod.vertex_academy_com.lesson_3_Java_8_ReferencesToMethods;

import java.util.function.Function;

/**
 * Created on 15.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MainClass {

    public static void main(String[] args) {
        //Function<String, Integer> toInteger = string -> parse(string);
        Function<String, Integer> toInteger = MainClass::parse;
        Integer integer = toInteger.apply("5");
    }

    private static Integer parse(String s) {
        return Integer.parseInt(s);
    }
}
