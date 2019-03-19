package ua.block08.task01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created on 19.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CountingItemsInSinglePassTest {

    @Test
    public void duplicates() throws Exception {
        CountingItemsInSinglePass count = new CountingItemsInSinglePass();
        List<Integer> list = new ArrayList<>(asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        Map<Integer, Long> result = count.countItems(list);

        assertEquals(Long.valueOf(1), result.get(-6));
        assertEquals(Long.valueOf(1), result.get(7));
        assertEquals(Long.valueOf(1), result.get(2));
        assertEquals(Long.valueOf(1), result.get(3));
        assertEquals(Long.valueOf(3), result.get(5));
        assertEquals(Long.valueOf(4), result.get(4));
    }
}
