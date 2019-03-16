package ua.blockj08.trainigcod.vertex_academy_com.lesson_2_Java_8_forEach;

import java.util.*;

/**
 * Created on 15.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ExampleForEach {

    public static void main(String[] args) {

        // forEach
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer number : numbers) {
            System.out.println(number);
        }*/

        // lambda
        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> System.out.println(number));*/

        // Set
        /*Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        for (Integer number : numbers) {
            System.out.println(number);
        }

        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        numbers.forEach(number -> System.out.println(number));*/

        /*Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 100);
        numbers.put(2, 200);
        numbers.put(3, 300);

        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }*/

        /*Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 100);
        numbers.put(2, 200);
        numbers.put(3, 300);
        numbers.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));*/

        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);*/

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(number -> {
            if (number > 2) {
                System.out.println(number);
            }
        });

    }
}
