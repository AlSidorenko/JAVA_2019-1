package ua.blockj08.trainigcod.vertex_academy_com.lesson_3_Java_8_ReferencesToMethods;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 15.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ExampleReference {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //numbers.forEach(number -> System.out.println(number));
        numbers.forEach(System.out::println);


    }
}
