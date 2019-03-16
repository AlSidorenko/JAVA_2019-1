package ua.blockj08.trainigcod.vertex_academy_com.lesson_4_Java_8_StreamFilter;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 16.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ExampleStreamFilterForEach {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /*
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        */

        numbers.stream().filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }
}
