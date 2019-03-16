package ua.blockj08.trainigcod.vertex_academy_com.lesson_5_Java_8_StreamMap;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created on 16.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ExampleCapitalizeStringsWithStreamMap {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "arya", "sansa");

        /*
        for (String s : names) {
            char[] chars = s.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            System.out.println(new String(chars)); //output: John Arya Sansa
        }
        */

        names.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);

    }
}
