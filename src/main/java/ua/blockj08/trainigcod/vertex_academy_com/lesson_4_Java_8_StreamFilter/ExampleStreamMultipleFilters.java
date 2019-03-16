package ua.blockj08.trainigcod.vertex_academy_com.lesson_4_Java_8_StreamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created on 16.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ExampleStreamMultipleFilters {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Daenerys", "Tyrion", "", null, "Arya");

        /*
        for (String name : names) {
            if (name != null && !name.isEmpty() && name.contains("a")) {
                System.out.println(name);
            }
        }
        */

        names.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty() && name.contains("a"))
                .forEach(System.out::println);

    }
}
