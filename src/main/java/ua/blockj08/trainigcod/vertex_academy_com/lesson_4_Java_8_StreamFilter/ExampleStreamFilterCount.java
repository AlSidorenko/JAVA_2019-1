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
public class ExampleStreamFilterCount {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jan", "Tirion", "Marry", "Nikolas");

        /*
        int counter = 0;
        for (String name : names) {
            if (name.length() > 4) {
                counter++;
            }
        }
        System.out.println(counter); //output 3
        */

        int count = (int) names.stream()
                .filter(i -> i.length() > 4)
                .count();
        System.out.println(count);
    }
}
