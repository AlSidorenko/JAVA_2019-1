package ua.block08.trainigcod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * Created on 13.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ExampleCountItems {

    public static Map<Integer, Integer> convertListBeforeJava8(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }

        return map;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        System.out.println(convertListBeforeJava8(list));

        List<Integer> items = Arrays.asList(1, 1, 2, 2, 2, 2);
        Map<Integer, Long> result = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
