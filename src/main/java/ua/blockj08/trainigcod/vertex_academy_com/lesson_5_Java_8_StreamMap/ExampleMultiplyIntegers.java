package ua.blockj08.trainigcod.vertex_academy_com.lesson_5_Java_8_StreamMap;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 16.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ExampleMultiplyIntegers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7);

        /*
        for (Integer i : numbers) {
            System.out.println(i * 2); //output 2 6 10 14
        }
        */

        numbers.stream()
                .map(i -> i * 2)
                .forEach(System.out::println);
    }
}
