package ua.block08.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * Created on 19.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CountingItemsInSinglePass {

    public Map<Integer, Long> countItems(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        CountingItemsInSinglePass count = new CountingItemsInSinglePass();

        List<Integer> list = new ArrayList<>(asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        System.out.println(count.countItems(list));
    }
}
